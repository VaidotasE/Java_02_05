package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ivesk du skaicius: ");
        int a = sc.nextInt();
        float x = (float) a;
        int b = sc.nextInt();
        float y = (float) b;

        System.out.println("Suma: " + suma(a, b));
        System.out.println("Suma F: " + suma((float) a, (float) b));

        System.out.println("Skirtumas: " + skirtumas(a, b));
        System.out.println("Skirtumas F: " + skirtumas((float) a, (float) b));
    }

    public static int suma(int a, int b) {
        return a + b;
    }
    public static float suma(float a, float b) {
        return a + b;
    }

    public static int skirtumas(int a, int b) {
        return a - b;
    }
    public static float skirtumas(float a, float b) {
        return a - b;
    }
}
