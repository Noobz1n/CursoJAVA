package Entities;

public class Dollar {
    public static double doll;
    public static double bought;
    public static double CurrencyConverter(){
        double total = bought * doll;
        return total += total * 6 / 100;
    }
}
