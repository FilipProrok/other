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

    public void getInfo(){
        System.out.println("Imie: " + firstName);
        System.out.println("Nazwisko: " + secondName);
        System.out.println("Wiek: " + age);
    }

}
