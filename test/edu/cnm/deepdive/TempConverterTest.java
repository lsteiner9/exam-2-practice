package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class TempConverterTest {

  static final double TOLERANCE = 0.01;

  @ParameterizedTest(name = "[{index}] Input: {0}; Output: {1}")
  @CsvFileSource(resources = {"c-f.csv"}, numLinesToSkip = 1)
  void celsiusToFahrenheit(double input, double expected) {
    assertEquals(expected, TempConverter.celsiusToFahrenheit(input), TOLERANCE);
  }

  @ParameterizedTest(name = "[{index}] Input: {0}; Output: {1}")
  @CsvFileSource(resources = {"c-k.csv"}, numLinesToSkip = 1)
  void celsiusToKelvin(double input, double expected) {
    assertEquals(expected, TempConverter.celsiusToKelvin(input), TOLERANCE);
  }

  @ParameterizedTest(name = "[{index}] Input: {0}; Output: {1}")
  @CsvFileSource(resources = {"f-c.csv"}, numLinesToSkip = 1)
  void fahrenheitToCelsius(double input, double expected) {
    assertEquals(expected, TempConverter.fahrenheitToCelsius(input), TOLERANCE);
  }

  @ParameterizedTest(name = "[{index}] Input: {0}; Output: {1}")
  @CsvFileSource(resources = {"f-k.csv"}, numLinesToSkip = 1)
  void fahrenheitToKelvin(double input, double expected) {
    assertEquals(expected, TempConverter.fahrenheitToKelvin(input), TOLERANCE);
  }

  @ParameterizedTest(name = "[{index}] Input: {0}; Output: {1}")
  @CsvFileSource(resources = {"k-c.csv"}, numLinesToSkip = 1)
  void kelvinToCelsius(double input, double expected) {
    assertEquals(expected, TempConverter.kelvinToCelsius(input), TOLERANCE);
  }

  @ParameterizedTest(name = "[{index}] Input: {0}; Output: {1}")
  @CsvFileSource(resources = {"k-f.csv"}, numLinesToSkip = 1)
  void kelvinToFahrenheit(double input, double expected) {
    assertEquals(expected, TempConverter.kelvinToFahrenheit(input), TOLERANCE);
  }
}