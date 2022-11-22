package com.mycompany.mooc;

import java.util.*;
import java.io.*;

/**
 *
 * @author lenovo
 */
public class MOOC {

    public static void main(String[] args) {

        printFromNumberToOne(5);
    }

    //the method should print the numbers from parameter toone
    public static void printFromNumberToOne(int number) {
        
        while (number >= 1) {
            System.out.println(number);
            number--;
        }

    }
}
