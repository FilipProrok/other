package pl.itechgroup.bank;

import pl.itechgroup.bank.zadanie.*;

public class Main {

    public static void getStringLength(String str) throws IllegalStateException {
        System.out.println(str.length());
        char[] tab = new char[1];
        for (int i = 1; i < str.length(); i++) {
            tab[i] = str.charAt(i);
        }
        }

    public static void main(String[] args) {
        Person jan = new Person("Jan", "Kowalski",55, true);
        Person adam = new Person("Adam", "Nowak",25, false);
        Account accountOne = new Account(2423432,1234,10);
        Account accountTwo = new Account(4335353,5432,7000);

        jan.setAccount(accountOne);
        adam.setAccount(accountTwo);

        accountOne.setPerson(jan);
        accountTwo.setPerson(adam);

        TransferService transferService = new TransferService();
        try {
            transferService.makeTransfer(10000000, jan.getAccount(), adam.getAccount());
        }catch(AccountIsBlockedException e){
            System.out.println("Your account is blocked!");
        } catch(NotEnoughMoneyException e){
            System.out.println("Not enough money!!!!! exception");
        }

        jan.getAccount().getInfo();
        adam.getAccount().getInfo();



        User firstUser = new User("Jan", "Kowalski", 55, "JanKowalski55", "JanKow55", true);
        System.out.println(firstUser.getInfo());
        User secondUser = new User("Kamil", "Slimak",25, "KAsll45","1234", true);
        System.out.println(secondUser.getInfo());




        /*
        Dollar dollar = new Dollar(10);
        */

        /*
        String text = "AAAAA";

        try {
            getStringLength(text);
        }
        catch (NullPointerException | IndexOutOfBoundsException e){
            System.out.println("Error");
        }
        finally{
            System.out.println(text);
        }
         */

    }
}