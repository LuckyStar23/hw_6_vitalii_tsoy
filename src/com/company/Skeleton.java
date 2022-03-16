package com.company;

 public class Skeleton extends Boss {
     private int numbersOfArrows;

     public Skeleton(String superAbility, int health, double damage, int numbersOfArrows) {
         super(superAbility, health, damage);
         this.numbersOfArrows = numbersOfArrows;

     }

     public int getNumbersOfArrows() {
         return numbersOfArrows;
     }

     public void setNumbersOfArrows(int numbersOfArrows) {
         this.numbersOfArrows = numbersOfArrows;
     }
         public String info() {
             return super.info() + "" + numbersOfArrows;
         }
     }
