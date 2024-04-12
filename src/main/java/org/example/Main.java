package org.example;

public class Main {
    public static void main(String[] args) {
       String name = "Zlata";
       int age = 30;
       float weight = 64.5F;
       int height = 175;

        System.out.println("Ім'я=" + name + " Вік=" + age + " Вага=" + weight + " Зріст=" + height);


        int a = 1;
        int b = 2;

        System.out.println("Значення до:" + " a=" + a + " b=" + b);

        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("Значення після:" + " a=" + a + " b=" + b);

        int a1 = 5;
        int b1 = 3;

        a1 = a1 + b1;
        b1 = b1 - a1;
        b1 = -b1;
        a1 = a1 - b1;

        System.out.println("a=" + a1 + " b=" + b1);



    }
}