package com.example;

import java.util.List;

public class Lion {

    protected boolean hasMane;
    protected Kittens kittens;
    protected Food food;

    /* Исправить замечание решила, создав единый конструктор. Первоначально создавала разные, т.к. думала, что это логичнее,
    потому что переменные не используются. Не стала делать инъекцию через класс - оставила через два интерфейса - т.к. в теории
    в тренажере говорится, что так правильнее:) Исправления так же коснулись класса AlexLion */
    public Lion(){
    }

    public Lion(String sex, Kittens kittens, Food food) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
        this.kittens = kittens;
        this.food = food;
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