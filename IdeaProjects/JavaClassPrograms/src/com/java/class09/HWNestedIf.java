package com.java.class09;

import java.util.Scanner;

public class HWNestedIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the 1st number : ");
        int num1 = input.nextInt();
        System.out.println("Please enter the 2nd number : ");
        int num2 = input.nextInt();
        System.out.println("Please enter the 3rd number : ");
        int num3 = input.nextInt();
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1 + " is the greatest");
            }
            else
                System.out.println(num3 + " is the greatest");
            }
        else {
            if (num2 > num3) {
                System.out.println(num2 + " is the greatest");
            }
            else
                System.out.println(num3 + " is the greatest");
        }

        }
    }
