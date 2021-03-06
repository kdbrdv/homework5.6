package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setDefence("Physical");
        boss.setDamage(60);
        boss.setHealth(800);
        System.out.println("Boss Health: " + boss.getHealth() + "; " + " Boss damage: " + boss.getDamage() +
                " HP, [" + boss.getDefence() + "]  ");
        Main hero = new Main();
        Hero[] heroes = hero.createHeroes();
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("Hero health: " + heroes[i].getHeroesHealth() + "; " + "Heroes damage: " + heroes[i].getHeroesDamage()
                    + "; " + "Heroes Attacktype: " + heroes[i].getHeroesAttackType() + ";");
        }

    }

    public static Hero[] createHeroes() {
        Hero physical = new Hero("Physical", 40, 350);
        Hero kinetic = new Hero(400, 35);
        Hero magical = new Hero("Magical", 40, 350);

        Hero[] heroes = {magical, kinetic, physical};

        return heroes;
    }
}
