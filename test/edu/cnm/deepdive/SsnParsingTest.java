package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class SsnParsingTest {

  @ParameterizedTest(name = "[{index}] Int[]: [{0}]; Expected: {1}")
  @CsvFileSource(resources = {"ints-test.csv"}, numLinesToSkip = 1)
  void intsToSSN(String numberString, String expected) {
    String[] numberStrings = numberString.split("\\s*,\\s*");
    int[] values = new int[numberStrings.length];
    for (int i = 0; i < numberStrings.length; i++) {
      values[i] = Integer.parseInt(numberStrings[i]);
    }
    assertEquals(expected, SsnParsing.intsToSSN(values));
  }

  @ParameterizedTest(name = "[{index}] String: {0}; Expected: [{1}]")
  @CsvFileSource(resources = {"string-test.csv"}, numLinesToSkip = 1)
  void ssnToInts() {
  }
}