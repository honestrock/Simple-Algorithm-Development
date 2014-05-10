/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ithouse.simple.algorithm.development;

/**
 *
 * @author apple
 */
public class ArmstrongDigits {
    public static void main(String[] args) {
        System.out.println("Armstong digist are ..");
        System.out.println("----------------------");
        int s=0,n=0;
        for (int i = 1; i < 10; i++) {
            
            for (int j = 0; j < 10; j++) {
                
                for (int k = 0; k < 10; k++) {
                    
                    s=100*i+10*j+k;
                    n=(int)(Math.pow(i, 3)+Math.pow(k, 3)+Math.pow(j, 3));
                    if(s==n){
                        System.out.println(s);
                    }
                    
                }
            }
        }
    }
}
