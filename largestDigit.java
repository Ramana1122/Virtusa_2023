package com.company;
import java.util.Scanner;
public class LargestDigit {
    public static void main(String[] args) {
        Scanner cs = new Scanner (System.in);
        System.out.println ("Enter the number");
        int num = cs.nextInt ();
        System.out.println ("Enter the number");
        int num1 = cs.nextInt ();
        System.out.println ("Enter the number");
        int num2 = cs.nextInt ();
        int reminder,reminder1,reminder2, Largest= 0,Largest1= 0,Largest2= 0,small;
        while (num > 0)
        {
            reminder = num % 10;
            if (Largest< reminder)
            {
                Largest= reminder;
            }
            else {
                small=reminder;
            }
            num = num / 10;
        }
        while (num1 > 0)
        {
            reminder1 = num1 % 10;
            if (Largest1< reminder1)
            {
                Largest1= reminder1;
            }
            num1 = num1 / 10;
        }
        while (num2 > 0)
        {
            reminder2 = num2 % 10;
            if (Largest2< reminder2)
            {
                Largest2= reminder2;
            }
            num2 = num2 / 10;
        }
        int k=Largest+Largest1+Largest2;
        System.out.println("\nThe Largest Digit is "+k);

        cs.close();
    }
}
