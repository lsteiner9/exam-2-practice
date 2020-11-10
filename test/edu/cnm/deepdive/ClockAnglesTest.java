package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class ClockAnglesTest {

  static final double TOLERANCE = 0.1;

  @DisplayName("Hour Hand Test")
  @ParameterizedTest(name = "[{index}] Hours: {0}; Minutes: {1}; Radians: {2}")
  @CsvFileSource(resources = {"hour-hand-test.csv"}, numLinesToSkip = 1)
  void hourHandRadians(int hours, double minutes, double expected) {
    double actual = ClockAngles.hourHandRadians(hours, minutes);
    assertEquals(expected, actual, TOLERANCE);
  }

  @DisplayName("Minute Hand Test")
  @ParameterizedTest(name = "[{index}] Minutes: {0}; Radians: {1}")
  @CsvFileSource(resources = {"minute-hand-test.csv"}, numLinesToSkip = 1)
  void minuteHandRadians(double minutes, double expected) {
    double actual = ClockAngles.minuteHandRadians(minutes);
    assertEquals(expected, actual, TOLERANCE);
  }
}