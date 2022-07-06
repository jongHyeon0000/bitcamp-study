package com.bitcamp.board;

public class Cat extends Animal{
    Cat(Jumpable jumpable){
        super(jumpable);
    }

    @Override
    public void animal_Name(){
        System.out.println("Cat");
    }
}

