package pl.itechgroup.bank.zadanie.currency;

public class Bitcoin extends Currency implements CryptoCurrency, CurrencyConverter{
    double value = 61123.00;

    public Bitcoin(int amount) {
        super(amount);
    }

    @Override
    public double exchange(Currency exchangeValue) {
        return 0;
    }
}
