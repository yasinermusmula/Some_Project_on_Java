package MaceraOyunProjesi;

import java.util.Random;

public class Obstacle {
    private String name;
    private int damage,award,healthy,maxNumber;

    public Obstacle(String name, int damage, int healthy, int maxNumber){
        this.name = name;
        this.damage = damage;
        this.healthy = healthy;
        this. maxNumber = maxNumber;
    }
    public int count(){
        Random r = new Random();
        return r.nextInt(this.maxNumber) + 1;
        // bunu yapmamizin sebebi icerideki max numberi alacak ve random sekilde atayacak
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }
}
