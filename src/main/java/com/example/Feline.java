package com.example;

import java.util.List;

public class Feline extends Animal implements Predator, Kittens {

    @Override                                             //Predator
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");             //из Animal   --> List.of("Животные", "Птицы", "Рыба")
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    @Override
    public int getKittens() {
        return getKittens(1);
    }     // --> 1


    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
