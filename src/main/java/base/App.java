/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Chris Mathew
 */
package base;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //input
        System.out.print("What is your age? ");
        String age = in.nextLine();

        //string conversion
        int a = Integer.parseInt(age);

        //ternary operator
        String output = (a >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";

        //single output
        System.out.println(output);
    }
}
