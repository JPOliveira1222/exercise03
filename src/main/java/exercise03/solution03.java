/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */

package exercise03;

import java.util.Scanner;

public class solution03 {
    /*
        Print "What is the quote?"

        quote = input from user, and puts it in quotation marks

        print "who said it?"

        'author' = input from user

        print 'author' + "says, " + quote
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the quote?");

        String quote = scanner.nextLine();

        System.out.println("Who said it?");

        String author = scanner.nextLine();

        System.out.println(author + " says, " + "\""+ quote+"\"");
    }
}
