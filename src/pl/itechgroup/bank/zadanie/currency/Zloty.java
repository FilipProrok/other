package pl.itechgroup.bank.zadanie.currency;

public class Zloty extends Currency implements TraditionalCurrency, CurrencyConverter{
    double value = 0.25;

    public Zloty(int amount) {
        super(amount);
    }


    @Override
    public double exchange(Currency exchangeValue) {
        return 0;
    }

    @Override
    public void showFaceValues() {

    }
}
