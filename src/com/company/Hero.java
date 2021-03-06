package com.company;

public class Hero {
    public String getHeroesAttackType() {
        return heroesAttackType;
    }

    public int getHeroesHealth() {
        return heroesHealth;
    }

    public int getHeroesDamage() {
        return heroesDamage;
    }

    private int heroesHealth;
    private int heroesDamage;
    private String heroesAttackType;

    public Hero() {
    }

    public Hero(String heroesAttackType, int heroesDamage, int heroesHealth) {
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;
        this.heroesAttackType = heroesAttackType;
    }

    public Hero(int heroesHealth, int heroesDamage) {
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;

    }

}

