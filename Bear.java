package com.creatures;

public class Bear extends Animal {
    private float height_of_the_bear;


    public void print_height_of_the_bear()   {
        System.out.println(String.format("The height of the bear is:  %f", height_of_the_bear));
    }
}
