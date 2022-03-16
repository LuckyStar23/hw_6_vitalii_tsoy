package com.company;

public class GameEntity {
    private String superAbility;
    private int health;
    private double damage;

    public String getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public GameEntity(String superAbility, int health, double damage) {
        this.superAbility = superAbility;
        this.health = health;
        this.damage = damage;
    }
}
