package pl.itechgroup.bank;

import pl.itechgroup.bank.object.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        BigFish shark = new BigFish();
        SmallFish salmon = new SmallFish();
        BigBird hawk = new BigBird();
        SmallReptile lizard = new SmallReptile();

        shark.eat();
        shark.swim();
        shark.getFood();

        Teeth teethOne = new Teeth();
        Teeth teethTwo = new Teeth();
        shark.setTeeths(List.of(teethOne, teethTwo));
    }
}