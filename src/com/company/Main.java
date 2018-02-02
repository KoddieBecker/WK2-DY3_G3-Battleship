package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      //  Scanner sc = new Scanner();
	// Group Participation #2 – Week 2
        //It should then assign 5 randomly picked locations, save their 'X' and 'Y'
        // Then prompt the user to guess an X location and a Y location.
        // game check guessed location again the game board and the
        // randomly picked locations, if their guess matches one of the randomly picked
        // locations, inform the user that they "HIT". If they guessed incorrectly,
        // inform them that they have "MISSED". Keep track of guessed locations, how
        // many randomly picked locations are left, and display those with the game
        // board after each guess. The display of the game board should reflect which
        // locations the user has already guessed. If a player guesses the same spot twice,
        // they should be prompted that they have already done so, not be penalized
        // with a guess, and guess again.
        //
        //Objectives:
        //•    Create and utilize array to manage collections of data
        //•    Process arrays using loops
        //•    Create and utilize 2 dimensional arrays to model tables and grids

       //not using int [][] declareStringArray = {1, 2, 3, 4, 5,};
        int h = 5;
        int w = 5;
        String [][] declareStringArray = new String[w][h];
        int counter = 0;
        String addASpace;

        for (int i = 0; i < w ; i++){
            for(int j = 0; j < h ; j++){
               counter++;
               if (counter < 10) {
                   addASpace = " " + String.valueOf(counter);
               } else {
                   addASpace = String.valueOf(counter);

               }
               declareStringArray[i][j] = addASpace;
               System.out.print(declareStringArray [i][j] + " ");

        } //inside for
            System.out.println(" ");

        } //outside for
    } //main
 } //class


