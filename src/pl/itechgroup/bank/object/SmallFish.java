package pl.itechgroup.bank.object;

public class SmallFish extends Animal implements Fish{

    @Override
    public void eat() {
        System.out.println("Small fish is eating");
    }

    @Override
    public void hunt() {
        System.out.println("Small fish is hunting");
    }

    @Override
    public void swim() {
        System.out.println("Small fish is swimming");
    }
}
