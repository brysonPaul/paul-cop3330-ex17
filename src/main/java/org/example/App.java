/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Bryson Paul
 */
package org.example;
import java.util.Scanner;
public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );
        int mOrF=0,amtOfOunces=0,weight=0,hrsSinceDrink=0;
        while(true){
            try{
                mOrF =Integer.parseInt( strIO("Enter a 1 is you are male or a 2 if you are female: ",sc));
                amtOfOunces = Integer.parseInt( strIO("How many ounces of alcohol did you have? ",sc));
                weight = Integer.parseInt( strIO("What is your weight, in pounds? ",sc));
                hrsSinceDrink = Integer.parseInt( strIO("How many hours has it been since your last drink? ",sc));
            } catch(Exception ex){
                System.out.println("only enter numeric values please");
                continue;
            }
            break;
        }
        double alcRatio =0;
        if(mOrF==1) {
            alcRatio= .73;
        } else {
            alcRatio = .66;
        }

        float bac = (float)(( amtOfOunces * 5.14 / weight * alcRatio ) - (.015 * hrsSinceDrink));
        System.out.println("\nYour BAC is "+bac);
        if(bac>=0.08) {
            System.out.println("It is not legal for you to drive.");
        } else {
            System.out.println("It is legal for you to drive.");
        }
    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
}