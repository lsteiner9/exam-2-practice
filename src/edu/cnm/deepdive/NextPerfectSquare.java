package edu.cnm.deepdive;

public class NextPerfectSquare {

  public static long nextSquare(long value) {
    return (value >= 0 && isSquare(value))
        ? (long)(Math.pow(Math.sqrt(value) + 1, 2))
        : 0;
  }

  private static boolean isSquare(long value) {
    double root = Math.sqrt(value);
    long rounded = Math.round(root);
    return (rounded * rounded == value);
  }

}
