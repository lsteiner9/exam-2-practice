package edu.cnm.deepdive;

public class GreatestCommonDivisor {

  public static long gcd(long valueA, long valueB) {
    long gcd = valueA;
    if (valueA == 0) {
      gcd = valueB;
    } else if (valueB == 0) {
      gcd = valueA;
    } else {
      gcd = (gcd(valueB, valueA % valueB));
    }
    return gcd;
  }

}
