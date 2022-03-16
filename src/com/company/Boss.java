package com.company;

public class Boss extends GameEntity {
    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Boss(String superAbility, int health, double damage) {
        super(superAbility, health, damage);
    }

    public String info() {
        return getSuperAbility() + " " + getHealth() + " " + getDamage() + " " + weapon.getNameOfWeapon() + " " + weapon.getTypeOfWeapon();
    }
}

