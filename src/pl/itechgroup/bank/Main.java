package pl.itechgroup.bank;

import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale locale = new Locale("pl","PL");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        double pensja = 1234.22;


    }
}