package pl.itechgroup.bank;

import pl.itechgroup.bank.zadanie.Account;
import pl.itechgroup.bank.zadanie.Person;
import pl.itechgroup.bank.zadanie.Transfer;

import java.io.File;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Person adam = new Person("Adam", "Kowalski", 45);
        Person jan = new Person("Jan", "Lewandowski", 55);
        Person dawid = new Person("Dawid","Kowal", 76);
        Person donald = new Person("Donald","Tusk", 22);
        Person kamil = new Person("Kamil","Kuczera", 95);

        Account accountA = new Account(224242534, 1234, 100000000);
        Account accountB = new Account(243424244, 7372, 3829239);
        Account accountC = new Account(456897777, 7282, 923840248);
        Account accountD = new Account(345453039, 7382, 384294824);

        Transfer transferA = new Transfer(100000);
        Transfer transferB = new Transfer(555);
        Transfer transferC = new Transfer(10);
        Transfer transferD = new Transfer(25000);

        List<Person> listaOsob = List.of(adam, jan, dawid, donald, kamil);
        List<Account> listaKont = List.of(accountA, accountB, accountC, accountD);
        List<Transfer> listaTransferow = List.of(transferA, transferB, transferC, transferD);

        Map<Integer, Person> mapaOsob = Map.of(1, adam, 2, jan, 3, dawid, 4, donald, 5, kamil);
        Map<Integer, Account> mapaKont = Map.of(1, accountA, 2, accountB, 3, accountC, 4, accountD);
        Map<Integer, Transfer> mapaTransferow = Map.of(1, transferA, 2,transferB, 3, transferC, 4, transferD);

        listaOsob.forEach(System.out::println);
        mapaOsob.forEach(System.out::println);

        PrintWriter saveFileList = new PrintWriter("C:/Users/ZSE/Documents/Pliki/plik.txt");
        saveFileList.println(listaOsob);



    }
}