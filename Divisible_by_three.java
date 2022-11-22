package com.mycompany.mooc;

import java.util.*;
import java.io.*;

/**
 *
 * @author lenovo
 */
public class MOOC {

 public static void main(String[] args) {
    divisibleByThreeInRange(2, 10);
}

    //the method should print the numbers from parameter toone
    public static void divisibleByThreeInRange(int a, int b) {
        
        for( int i=a; i<=b; i++){
            if(i%3==0){
            System.out.println(i);
            }
        }

    }
}
