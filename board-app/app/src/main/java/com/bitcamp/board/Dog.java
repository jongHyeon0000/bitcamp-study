package com.bitcamp.board;

public class Dog extends Animal{
    Dog(Jumpable jumpable){
        super(jumpable);
    }

    @Override
    public void animal_Name(){
        System.out.println("Dog");
    }
}
