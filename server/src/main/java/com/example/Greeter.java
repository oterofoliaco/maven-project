package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * @param someone of person
   * @return hello mas entrada.
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
