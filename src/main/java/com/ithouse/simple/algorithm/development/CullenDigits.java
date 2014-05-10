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
public class CullenDigits {
    public static void main(String[] args) {
        int n,temp;
        System.out.println("Cullen digits");
        Scanner scn=new Scanner(System.in);
        System.out.println("From to digit enter:");
        n=scn.nextInt();
        for(int i=1;i<=n;i++){
            temp=(int)(i*(Math.pow(2, i)));
        System.out.println(temp);
        }
    }
}
