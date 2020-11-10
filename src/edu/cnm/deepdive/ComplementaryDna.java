package edu.cnm.deepdive;

public class ComplementaryDna {

  public static String complement(String dna) {
    StringBuilder builder = new StringBuilder(dna.length());
    for (char c : dna.toLowerCase().toCharArray()) {
      switch (c) {
        case 'a':
          builder.append("T");
          break;
        case 't':
          builder.append("A");
          break;
        case 'g':
          builder.append("C");
          break;
        default:
          builder.append("G");
      }
    }
    return builder.toString();
  }

}
