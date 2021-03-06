package com.company;

public class Boss {
    public int getHealth() {
        return bossHealth;
    }

    public void setHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getDamage() {
        return bossDamage;
    }

    public void setDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public String getDefence() {
        return bossDefence;
    }

    public void setDefence(String bossDefence) {
        this.bossDefence = bossDefence;
    }

    private int bossHealth;
    private int bossDamage;
    private String bossDefence;
}
