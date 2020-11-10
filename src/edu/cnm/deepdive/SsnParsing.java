package edu.cnm.deepdive;

public class SsnParsing {

  private static final int SSN_LENGTH = 9;
  private static final String LEADING_ZERO = "0";
  private static final String DELIMITER = "-";
  private static final int FIRST_DELIMITER_POSITION = 3;
  private static final int SECOND_DELIMITER_POSITION = 7;

  public static String intsToSSN(int[] ssn) {
    StringBuilder builder = new StringBuilder(SSN_LENGTH + 2);
    for (int i = 0; i < ssn.length; i++) {
      builder.append(ssn[i]);
    }
    int length = builder.length();
    if (length < SSN_LENGTH) {
      builder.insert(0, LEADING_ZERO.repeat(SSN_LENGTH - length));
    }
    builder
        .insert(FIRST_DELIMITER_POSITION, DELIMITER)
        .insert(SECOND_DELIMITER_POSITION, DELIMITER);
    return builder.toString();
  }

  public static int[] ssnToInts(String ssn) {
    int[] ssnArray = new int[3];
    String[] ssnStrings = ssn.split(DELIMITER);
    for (int i = 0; i < ssnStrings.length; i++) {
      ssnArray[i] = Integer.parseInt(ssnStrings[i]);
    }
    return ssnArray;
  }

}
