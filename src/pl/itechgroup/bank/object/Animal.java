package pl.itechgroup.bank.object;

import java.util.List;

public abstract class Animal {

    private String type;
    private int speed;
    private boolean isAlive;

    public String getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }



    /*
    public Animal(String type, int speed){
        this.type = type;
        this.speed = speed;
    }
    */

    Owner owner = new Owner();

    public abstract void eat();

    public void getFood(){
        hunt();
    }

    protected abstract void hunt();

}
