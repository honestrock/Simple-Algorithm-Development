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
public class ComputeFactorialRecusion {
    
    public static void main(String[] args) {
        System.out.println("Please enger a digit ");
        Scanner scn=new Scanner(System.in);
        
        int digit=scn.nextInt();
        
        
        
        
        
    }
    
    public int factorial(int digit){
        if(digit==0){
            return 1;
        }else{
            return digit*factorial(digit-1);
        }
    }
    
}
