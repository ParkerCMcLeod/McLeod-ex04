/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Parker McLeod
 */

import java.util.Scanner;

public class Solution04 {

    public static void main(String[] args) {
        /*
        1. Prompt user for noun.
        2. Create new Scanner 'scanner'.
        3. Save noun input as 'noun'.
        4. Repeat for verb, adjective, and adverb.
        5. Print phrase combining statements.
         */
        System.out.print("Enter a noun: ");
        Scanner scanner = new Scanner(System.in);
        String noun = scanner.nextLine();
        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();
        System.out.print("Enter a adjective: ");
        String adjective = scanner.nextLine();
        System.out.print("Enter a adverb: ");
        String adverb = scanner.nextLine();
        System.out.print("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!\n" );
    }
}