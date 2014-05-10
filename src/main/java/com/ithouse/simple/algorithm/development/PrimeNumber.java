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
public class PrimeNumber {
    public static void main(String[] args) {
        int N,s=0;
        Scanner scn=new Scanner(System.in);
        System.out.println("The Upper Limit enter");
        N=scn.nextInt();
        for(int i=2;i<=N;i++){
            s=0;
            for(int j=1;j<=i;j++){
               
                if((i%j)==0){
                    s++;
                }
     
            }
            
            if(s==2){
                    System.out.println(i);
                }
            
        }
        
    }
}
