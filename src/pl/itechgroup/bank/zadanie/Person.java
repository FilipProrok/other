package pl.itechgroup.bank.zadanie;

public class Person {
    String firstName;
    String secondName;
    int age;
    boolean isBlocked;

    Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Person(String firstName, String secondName, int age, boolean isBlocked){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.isBlocked = isBlocked;
    }

    public String getInfo(){

        return String.format("Imie: %s, Nazwisko: %s, Wiek: %d, ", firstName, secondName, age );

    }

    @Override
    public String toString() {
        return getInfo();
    }

}
