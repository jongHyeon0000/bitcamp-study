/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.bitcamp.board;

public class App {
    public static void main(String[] args) {
        Animal cat = new Cat(new Can_Jump());
        Animal dog = new Dog(new Cant_Jump());

        cat.animal_Name();
        cat.canIJump();
        dog.animal_Name();
        dog.canIJump();
        dog.setterToJump(new Can_Jump());
        dog.canIJump();
    }
}


