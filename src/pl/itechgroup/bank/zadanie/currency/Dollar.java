package pl.itechgroup.bank.zadanie.currency;

public class Dollar extends Currency implements TraditionalCurrency, CurrencyConverter{

    double value = 1;

    public Dollar(int amount) {
        super(amount);
    }
    /*
    @Override
    public double exchange(Euro exchangeValue) {
        return this.amount * exchangeValue.value * this.value;
    }
     */

    @Override
    public void showFaceValues() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coins: 1¢, 5¢, 10¢, 25¢, 50¢, 1$%n");
        sb.append("Banknotes: $1, $2, $5, $10, $20, $50, $100%n");
        System.out.println(sb);
    }

    @Override
    public double exchange(Currency exchangeValue) {
        return 0;
    }

    /*
    @Override
    public double toBitcoin(int amount) {
        return amount * 0.000016;
    }

    @Override
    public double toDollar(int amount) {
        return amount;
    }

    @Override
    public double toEuro(int amount) {
        return amount * 0.86;
    }

    @Override
    public double toZloty(int amount) {
        return amount * 3.99;
    }
     */
}
