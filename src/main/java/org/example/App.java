/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Matthew Cuza
 */
package org.example;
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        System.out.println( "How many euros are you exchanging? " );
        double euro = sc.nextDouble();

        System.out.println( "What is the exchange rate? " );
        double rate = sc.nextDouble();

        double dollar = (euro * rate);

        System.out.format( (int)euro +" euros at an exchange rate of "+ rate + " is\n"+ (Math.round(dollar*100.0)/100.0) + " U.S. dollars.");
    }
}
