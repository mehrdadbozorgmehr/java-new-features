package java18_to_21.structured_concurrency_2.model;

public record Invoice() {
  public static Invoice generate(Order order, Customer customer, String invoiceTemplate) {
    return new Invoice();
  }
}
