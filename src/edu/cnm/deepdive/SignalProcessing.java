package edu.cnm.deepdive;

public class SignalProcessing {

  public static int[] process(int[] values, int multiplier) {
    int[] processed = new int[values.length];
    for (int i = 0; i < values.length; i++) {
      processed[i] = values[i] * multiplier;
    }
    return processed;
  }

}
