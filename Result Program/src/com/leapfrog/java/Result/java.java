/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.java.Result;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
          double english, maths, computer, economics, account, total=0, percentage=1;

           System.out.println("Enter the marks of english");
            english = input.nextDouble();

              System.out.println("Enter the marks of maths");
                maths = input.nextDouble();

                 System.out.println("Enter the marks of computer");
                   computer = input.nextDouble();

                    System.out.println("Enter the marks of account");
                      account = input.nextDouble();

                        System.out.println("Enter the marks of economics");
                          economics = input.nextDouble();

    
        
          
       if(english>=40&& account>=40&& economics>=40&& maths>=40&& computer>=40)
       {
           total = english + maths + computer + account + economics;
             System.out.println("total marks=" + total);
              percentage= total/5;
               System.out.println("percentage=" +percentage);
           
                if(percentage>=80)
                 System.out.println("dist.");
                  else if(percentage>=60)
                     System.out.println("first div.");
                      else if(percentage>=45)
                          System.out.println("second div.");
                            else
                        System.out.println("third div.");
    }
          else
            System.out.println("failed");
}
}