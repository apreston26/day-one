package edu.cnm.deepdive;
// ^^ must be the first line no matter what
public class TemperatureConversion { //if this is spelled wrong use the refractor tool

  private static final double CELSIUS_TO_FAHRENHEIT_SCALE = 9.0 / 5;
  private static final double FAHRENHEIT_TO_CELSIUS_SCALE = 1/CELSIUS_TO_FAHRENHEIT_SCALE;
  private static final double SCALE_OFFSET = 32;

  public static void main(String[] args) {
    if (args.length == 0) {
      double tempCelsius = 100;
      double tempFahrenheit = 32;
      System.out.println("Celsius " + tempCelsius + " = " + convertC2F(tempCelsius) + " Fahrenheit");
      System.out.println("Fahrenheit " + tempFahrenheit + " = " + convertF2C(tempFahrenheit) + " Celsius");
    } else {
      for (int i = 0; i < args.length; i++) {
        double tempCelsius = Double.parseDouble(args[i]); // parsing changes a string to something more meaningful in this case a double
        System.out.println("Celsius " + tempCelsius + " = " + convertC2F(tempCelsius) + " Fahrenheit"); // this is different than above as any small line out of brackets won't transfer
      }
    }
  }

  public static double convertC2F(double celsius) {
    return celsius * CELSIUS_TO_FAHRENHEIT_SCALE + SCALE_OFFSET;
  }

  public static double convertF2C(double fahrenheit) {
    return (fahrenheit - SCALE_OFFSET) * FAHRENHEIT_TO_CELSIUS_SCALE;
  }

  public static double[] convertC2F(double[]celsiusTemperatures) {
    double[] fahrenheitTemperatures = new double[celsiusTemperatures.length];
    for (int i = 0; i < celsiusTemperatures.length; i++) {
      double celsius = celsiusTemperatures[i];
      double fahrenheit = convertC2F(celsius);
      fahrenheitTemperatures[i] = fahrenheit;
    }
    return fahrenheitTemperatures;
  }
}
