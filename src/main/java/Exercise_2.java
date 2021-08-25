/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Spenser Tacinlli
 */

import java.util.Scanner;

public class Exercise_2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the input string? ");

        String input_string = scanner.nextLine();
        int string_count = input_string.length();

        System.out.println(input_string + " has " + string_count + " characters.");
    }
}
