/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mooc;

import java.util.*;
import java.io.*;

/**
 *
 * @author lenovo
 */
public class MOOC {

    public static void main(String[] args) {

        // ask the user for the number of times that the phrase will be printed
        Scanner console = new Scanner(System.in);
        System.out.println("How many times?");
        int n = console.nextInt();

        // use the while command to call the method a suitable number of times
        int i = 0;

        while (i < n) {
            printText();
            i++;
        }

    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
        // write some code in here
    }
}
