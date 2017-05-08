package com.example.imran.funfact;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by imran on 5/8/2017.
 */

public class FactColor {
    private int colorAsint;
    private String color;
    private final String [] colors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    public int getColor(){
        Random randomFact = new Random();
        int randomNumber = randomFact.nextInt(colors.length);
        color= colors[randomNumber];
        colorAsint = Color.parseColor(color);
        return colorAsint;
    }
}
