package pl.itechgroup.bank.zadanie;

public class Transfer {
    int amount;

    public Transfer(int amount) {
        this.amount = amount;
    }

    public void getInfo(){
        System.out.println("Kwota transferu: " + amount + " PLN");
    }
}
