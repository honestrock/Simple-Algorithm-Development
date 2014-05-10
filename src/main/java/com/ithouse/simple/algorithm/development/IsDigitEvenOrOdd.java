/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ithouse.simple.algorithm.development;

import java.util.Scanner;

/**
 *
 * @author apple
 */
public class IsDigitEvenOrOdd {
    
    public static void main(String[] args) {
        float digit;
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Digit :");
        digit=scn.nextInt();
        if((int)(digit/2)==(digit/2))
        System.out.println("Mod 2 ==0");
        else System.out.println("Mod 2 =!0");
        
    }
    
}
