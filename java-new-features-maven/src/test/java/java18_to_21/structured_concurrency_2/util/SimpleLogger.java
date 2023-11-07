package java18_to_21.structured_concurrency_2.util;

public final class SimpleLogger {

  private SimpleLogger() {}

  public static void log(String description) {
    System.out.printf("[%s] %s%n", Thread.currentThread(), description);
  }
}
