package com.Heather;

import java.util.LinkedList;

/**
 * Created by iv2070fj on 3/24/2016.
 */
public class Snake implements Comparable<Snake>{
    String species;
    double venomRating;


    public Snake(String s, double v){
        this.species=s;
        this.venomRating=v;
    }

    public int compareTo(Snake anotherSnake){
        int r=0;
        if(this.venomRating < anotherSnake.getVenomRating()) {
            r= 1;
        }else if (this.venomRating > anotherSnake.getVenomRating()) {
            r= -1;
        }else{
            r=this.getSpecies().compareTo(anotherSnake.getSpecies());
        }
        return r;
    }

    public double getVenomRating() {
        return venomRating;
    }

    public String getSpecies() {
        return species;
    }

    public void writeSnake() {

        System.out.println("The " + this.getSpecies() + " has a venom rating of " + this.getVenomRating() + ".");

    }
}
