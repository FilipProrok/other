package pl.itechgroup.bank.zadanie.currency;

public interface CurrencyConverter {

    /*
    double toBitcoin(int amount);
    double toDollar(int amount);
    double toEuro(int amount);
    double toZloty(int amount);
     */

    public double exchange(Currency exchangeValue);

}
