package java18_to_21.structured_concurrency_2;


import java18_to_21.structured_concurrency_2.model.Customer;
import java18_to_21.structured_concurrency_2.model.Invoice;
import java18_to_21.structured_concurrency_2.model.Order;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.StructuredTaskScope;
import java.util.concurrent.StructuredTaskScope.Subtask;

import static java18_to_21.structured_concurrency_2.model.RepositoryWithScopedValue.*;
import static java18_to_21.structured_concurrency_2.util.SimpleLogger.log;


public class StructuredConcurrencyDemo {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    StructuredConcurrencyDemo demo = new StructuredConcurrencyDemo();
    demo.createInvoice(10012, 61157, "en");
  }

  Invoice createInvoice(int orderId, int customerId, String language) throws InterruptedException {
    try (var scope = new StructuredTaskScope<>()) {
      log("Forking tasks");
      Subtask<Order> orderSubtask = scope.fork(() -> loadOrderFromOrderService(orderId));

      Subtask<Customer> customerSubtask = scope.fork(() -> loadCustomerFromDatabase(customerId));

      Subtask<String> invoiceTemplateSubtask =
          scope.fork(() -> loadInvoiceTemplateFromFile(language));

      log("Waiting for all tasks to finish");
      scope.join();

      log("Retrieving results");
      Order order = orderSubtask.get();
      Customer customer = customerSubtask.get();
      String invoiceTemplate = invoiceTemplateSubtask.get();

      log("Generating invoice");
      Invoice invoice = Invoice.generate(order, customer, invoiceTemplate);

      log("Done");
      return invoice;
    }
  }
}
