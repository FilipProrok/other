package pl.itechgroup.bank.object;

public class SmallReptile extends Animal implements Reptile{

    @Override
    public void eat() {
        System.out.println("Small reptile is eating");
    }

    @Override
    public void hunt() {
        System.out.println("Small reptile is hunting");
    }

    @Override
    public void walk() {
        System.out.println("Small reptile is walking");
    }
}
