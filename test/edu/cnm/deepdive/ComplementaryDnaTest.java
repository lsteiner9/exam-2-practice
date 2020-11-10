package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class ComplementaryDnaTest {

  @DisplayName("DnaTest")
  @ParameterizedTest(name = "[{index}] Input = {0}; Expected = {1}")
  @CsvFileSource(resources = {"dna-test.csv"}, numLinesToSkip = 1)
  void complement(String input, String expected) {
    assertEquals(expected, ComplementaryDna.complement(input));
  }
}