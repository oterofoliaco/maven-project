package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {
    System.out.println("constric");
  }

  /**
   * @param someone of person
   * @return hello mas entrada.
   */
  public final String greet(final String someone) {
    return String.format("Hello Otero Foliaco, %s!", someone);
  }
}
