package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class StringSlicingTest {

  @ParameterizedTest(name = "[{index}] String: {0}; Begin: {1}; End: {2}; Stride: {3}")
  @CsvFileSource(resources = {"slice-test.csv"}, numLinesToSkip = 1)
  void sliced(String input, int beginIndex, int endIndex, int stride, String expected) {
    String actual = StringSlicing.sliced(input, beginIndex, endIndex, stride);
    assertEquals(expected, actual);
  }
}