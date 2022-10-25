/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uts;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class KotakKosong {
    public static void main(String []args){
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan sisi  : "); 
        int input = masukan.nextInt();
        
        System.out.println("==Hasil Pola Persegi==");
         for (int i = 0; i < input; i++){
            for (int j = 0; j < input; j++){
                if (i==0 || i==input-1 || j==0 || j==input-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                    
                }
            }
            System.out.println("");    
        }
    }
}
