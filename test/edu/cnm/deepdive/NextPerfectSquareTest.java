package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class NextPerfectSquareTest {

  @DisplayName("NextPerfectSquare Test")
  @ParameterizedTest(name = "[{index}] Input: {0}; Expected: {1}")
  @CsvFileSource(resources = {"next-square-test.csv"}, numLinesToSkip = 1)
  void nextSquare(long input, long expected) {
    assertEquals(expected, NextPerfectSquare.nextSquare(input));
  }
}