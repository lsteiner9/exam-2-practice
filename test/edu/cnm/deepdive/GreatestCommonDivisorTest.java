package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class GreatestCommonDivisorTest {

  @DisplayName("GCD test")
  @ParameterizedTest(name = "[{index}] Value A: {0}, Value B: {1}, Expected: {2}")
  @CsvFileSource(resources = {"gcd-test.csv"}, numLinesToSkip = 1)
  void gcd(long valueA, long valueB, long expected) {
    assertEquals(expected, GreatestCommonDivisor.gcd(valueA, valueB));
  }
}