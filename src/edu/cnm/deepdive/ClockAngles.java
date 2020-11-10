package edu.cnm.deepdive;

public class ClockAngles {

  private static final double RADIANS_PER_MINUTE = 2 * Math.PI / 60;
  private static final double RADIANS_PER_HOUR = 2 * Math.PI / 12;

  public static double hourHandRadians(int hours, double minutes) {
    hours = (hours - 3) % 12;
    hours = (hours > 0) ? 12 - hours : Math.abs(hours);
    minutes = (minutes - 15) % 60;
    minutes = (minutes > 0) ? 60 - minutes : Math.abs(minutes);

    return (hours * RADIANS_PER_HOUR) - (minutes * RADIANS_PER_HOUR / 60);
  }

  public static double minuteHandRadians(double minutes) {
    minutes = (minutes - 15) % 60;
    minutes = (minutes > 0) ? 60 - minutes : Math.abs(minutes);
    return (minutes * RADIANS_PER_MINUTE);

  }


}