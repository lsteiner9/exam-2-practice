package edu.cnm.deepdive;

public class TempConverter {

  /* May need to:
        filter text values to only accept numbers
        pop up a toast if any non-number values are present

     Upon click of Celsius:
        value = the current textfield of celsius
        set textfield of Fahrenheit to celsiusToFahrenheit(value)
        set textfield of Kelvin to celsiusToKelvin(value)
     Upon click of Fahrenheit:
        value = the current textfield of fahrenheit
        set textfield of Celsius to fahrenheitToCelsius(value)
        set textfield of Kelvin to fahrenheitToKelvin(value)
     Upon click of Kelvin:
        value = the current textfield of kelvin
        set textfield of Celsius to kelvinToCelsius(value)
        set textfield of Fahrenheit to kelvinToFahrenheit(value)
   */

  public static double celsiusToFahrenheit(double celsius) {
    return (celsius * 9 / 5) + 32;
  }

  public static double celsiusToKelvin(double celsius) {
    return celsius + 273.15;
  }

  public static double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
  }

  public static double fahrenheitToKelvin(double fahrenheit) {
    return celsiusToKelvin(fahrenheitToCelsius(fahrenheit));
  }

  public static double kelvinToCelsius(double kelvin) {
    return kelvin - 273.15;
  }

  public static double kelvinToFahrenheit(double kelvin) {
    return celsiusToFahrenheit(kelvinToCelsius(kelvin));
  }

}
