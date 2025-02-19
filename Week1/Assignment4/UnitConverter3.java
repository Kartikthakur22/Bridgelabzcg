package Week1.Assignment4;

public class UnitConverter3 {
    public static double convertFarhenheitToCelsius(double farhenheit){
        return (farhenheit - 32) * 5 / 9;
    }
    public static double convertCelsiusToFarhenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }
    public static double convertPoundsToKilograms(double pounds){
        return pounds*0.453592;
    }
    public static double convertKilogramsToPounds(double kilograms){
        return kilograms*2.20462;
    }
    public static double convertgallonsToLitres(double gallons){
        return gallons*3.78541;
    }
    public static double convertLitresToGallons(double litres){
        return litres*0.264172;
    }
}
