package lv.acodemy.classroom;

import lombok.AllArgsConstructor;
import lombok.Getter;


import  lombok.Setter;
@Getter
@AllArgsConstructor


public class Cat {


        private String name;

        private String color;

        @Setter
        private int age;

        @Setter
        private double weight;

        private String breed;

        private String gender;

        private boolean hasFur;

        public int getCurrentEnergy() {
                return currentEnergy;
        }

        // private final int MAX_ENERGY = 5;
        private int currentEnergy = 5;


        public Cat(String name) {
                this.name = name;
        }


        public Cat(String name, String color, String breed, String gender, boolean hasFur) {
                this.name = name;
                this.color = color;
                this.breed = breed;
                this.gender = gender;
                this.hasFur = hasFur;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }



        public void speak() {
                System.out.println("Meow!");
        }

        public void feed() {
                if(currentEnergy == 5) {
                        System.out.println("Nooooooooow");
                } else {
                        System.out.println("om-nom-nom");
                        currentEnergy++;
                }
        }

        public void walk (){
                if(currentEnergy <= 0) {
                        System.out.println("Can not walk anymore");
                } else {

                        System.out.println("Walkie-walkie!");
                        currentEnergy--;
                }

        }






        public String getName() {
                return name;
        }

        public String getColor() {
                return color;
        }

        public String getBreed() {
                return breed;
        }

        public String getGender() {
                return gender;
        }

        public boolean isHasFur() {
                return hasFur;
        }

        public double getWeight() {
                return weight;
        }

        public void setWeight(double weight) {
                this.weight = weight;
        }


}
