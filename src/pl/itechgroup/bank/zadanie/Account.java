package pl.itechgroup.bank.zadanie;

public class Account {
    long accountNumber;
    int password;
    int balance;

    Person person;

    public Account(long accountNumber, int password, int balance) {
        this.accountNumber = accountNumber;
        this.password = password;
        this.balance = balance;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void getInfo(){
        System.out.println("Numer konta: " + accountNumber);
        System.out.println("Hasło: " + password);
        System.out.println("Balans konta: " + balance + " PLN");
    }
}
