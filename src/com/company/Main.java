package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss("Super fast", 100, 99.99);
        boss.weapon.setTypeOfWeapon("minigun");
        boss.weapon.setNameOfWeapon("katyusha");
        System.out.println(boss.info());

        Skeleton skeleton = new Skeleton("flying", 123, 77.50, 14);
        skeleton.weapon.setNameOfWeapon("ubiyca");
        skeleton.weapon.setTypeOfWeapon("bows ");
        Skeleton skeleton2 = new Skeleton(" invisible", 115, 50.05, 25);
        skeleton2.weapon.setTypeOfWeapon(" bows ");
        skeleton2.weapon.setNameOfWeapon(" kingsman");
        System.out.println(skeleton.info() + " " + skeleton2.info());

    }
}

