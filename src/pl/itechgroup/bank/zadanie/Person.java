package pl.itechgroup.bank.zadanie;

public class Person {
    String firstName;
    String secondName;
    int age;

    public Person(String firstName, String secondName, int age){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }




    public String getInfo(){

        return String.format("Imie: %s, Nazwisko: %s, Wiek: %d, ", firstName, secondName, age );

    }

    @Override
    public String toString() {
        return getInfo();
    }

}
