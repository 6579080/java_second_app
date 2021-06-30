package com.company;


import java.util.Scanner;

public class Main {
    static double func(double a, double b, double c){
        double result, result_numerator, result_denomirator, result_fraction, result_right;
        double result_pow = Math.pow(b, 2);
        double result_sum =  result_pow + (4 * a * c);
        // double result_numerator = Math.sqrt(result_sum) + b;

        result_numerator = b + Math.sqrt((Math.pow(b, 2) + 4 * a * c));
        result_denomirator = 2 * a;
        result_fraction = result_numerator / result_denomirator;
        result_right = Math.pow(a, 3) * c + Math.pow(b, -2);

        result = result_fraction - result_right;


        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
	// write your code here
        double a, b, c;
        Scanner in = new Scanner (System.in);
        System.out.println("Введите а: ");
        a = in.nextDouble();
        System.out.println("Введите b: ");
        b = in.nextDouble();
        System.out.println("Введите c: ");
        c = in.nextDouble();
        func(a, b, c);
    }

}
