package pl.itechgroup.bank.object;

public class BigBird extends Animal implements Bird {

    @Override
    public void eat() {
        System.out.println("Big bird is eating");
    }

    @Override
    public void hunt() {
        System.out.println("Big bird is hunting");
    }

    @Override
    public void fly() {
        System.out.println("Big bird is flying");
    }
}
