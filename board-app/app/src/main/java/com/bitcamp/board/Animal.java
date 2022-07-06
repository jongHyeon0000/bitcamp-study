package com.bitcamp.board;

public abstract class Animal{
    private Jumpable jumpable;
    Animal(Jumpable jumpable){
        this.jumpable = jumpable;
    }

    abstract public void animal_Name();
    public void canIJump(){
        jumpable.jump();
    }

    public void setterToJump(Jumpable jumpable){
        this.jumpable = jumpable;
    }
}
