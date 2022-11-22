
package com.mycompany.mooc;

import java.util.*;
import java.io.*;

/**
 *
 * @author lenovo
 */
public class MOOC {

    public static void main(String[] args) {

        printUntilNumber(5);
    }

    //the method should print the numbers from one to the number passed as a parameter
    public static void printUntilNumber(int number) {
        int i = 1;
        while (i <= number) {
            System.out.println(i);
            i++;
        }

    }
}
