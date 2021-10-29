package pl.itechgroup.bank.object;

import java.util.List;

public class BigFish extends Animal implements Fish{

    /*
    public BigFish(String type, int speed) {
        super(type);
        super(speed);
    }
    */


    List<Teeth> teeths;
    private Tail tail;

    public BigFish(){
        tail = new Tail();
    }

    public List<Teeth> getTeeths() {
        return teeths;
    }

    public void setTeeths(List<Teeth> teeths) {
        this.teeths = teeths;
    }

    @Override
    public void eat() {
        System.out.println("Big fish is eating");
    }

    @Override
    protected void hunt() {
        System.out.println("Big fish is hunting");
    }

    @Override
    public void swim() {
        System.out.println("Big fish is swimming");
    }
}
