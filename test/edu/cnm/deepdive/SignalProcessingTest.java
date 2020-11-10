package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class SignalProcessingTest {

  @DisplayName("SignalProcessingTest")
  @ParameterizedTest(name = "[{index}] Input[] = [{0}]; Multiplier = {1} Expected[] = [{2}]")
  @CsvFileSource(resources = {"signal-processing-test.csv"}, numLinesToSkip = 1)
  void process(String inputString, int multiplier, String expectedString) {
    if (inputString.length() > 0 && expectedString.length() > 0) {
      String[] inputStrings = inputString.split("\\s*,\\s*");
      String[] expectedStrings = expectedString.split("\\s*,\\s*");
      int[] input = new int[inputStrings.length];
      int[] expected = new int[expectedStrings.length];
      for (int i = 0; i < inputStrings.length; i++) {
        input[i] = Integer.parseInt(inputStrings[i]);
        expected[i] = Integer.parseInt(expectedStrings[i]);
        assertArrayEquals(expected, SignalProcessing.process(input, multiplier));
      }
    } else if (inputString.length() == expectedString.length()){
      assertArrayEquals(new int[] {}, SignalProcessing.process(new int[] {}, multiplier));
    } else {
      assertTrue(false);
    }
  }
}