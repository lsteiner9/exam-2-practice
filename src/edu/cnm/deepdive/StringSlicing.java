package edu.cnm.deepdive;

public class StringSlicing {

  public static String sliced(String input, int beginIndex, int endIndex, int stride) {
    StringBuilder builder = new StringBuilder();
    String substring = input.substring(beginIndex, endIndex);
    for (int i = 0; i < substring.length(); i += stride) {
      builder.append(substring.charAt(i));
    }
    return builder.toString();
  }

}
