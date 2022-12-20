package com.example;

import java.util.List;

public class Lion {

    protected boolean hasMane;
    protected Kittens kittens;
    protected Food food;

    public Lion(Kittens kittens) {
        this.kittens = kittens;
    }
    public Lion(Food food) {
        this.food = food;
    }
    public Lion(){

    }

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    public int getKittens() {
        return kittens.getKittens();
    }   // --> 1

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return food.getFood("Хищник");       // --> List.of("Животные", "Птицы", "Рыба")
    }
}
