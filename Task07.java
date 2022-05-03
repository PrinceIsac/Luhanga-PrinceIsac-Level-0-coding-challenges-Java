public class Task07 {
  public static double celsiusToFahrenheit(double tempCelsius){
        double fahrenheit = ((tempCelsius * 9/5) + 32);
        return fahrenheit;
   }

  public static double fahrenheitToCelsius(double tempFahrenheit){
        double celsius = (tempFahrenheit - 32) * 5/9;
        return celsius;
    }
  
    public static void main(String[] args) {
         celsiusToFahrenheit(25);
         fahrenheitToCelsius(104);
         fahrenheitToCelsius(-75);
         celsiusToFahrenheit(-29);
    }
}
