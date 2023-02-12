package arrays;

import java.util.Scanner;

public class Enteros {
    public static void main(String[] args) {
        //Escribe un programa que lea 10 números por teclado y que luego los muestre
        //en orden inverso, es decir, el primero que se introduce es el último en
        //mostrarse y viceversa.
        Scanner sc=new Scanner(System.in);
        System.out.println("escribe 10 numeros");
        //declaramos el array
        int num[]=new int[10];
        for (int i = 0; i < num.length ; i++) {
            num[i]=sc.nextInt();

        }
        for (int i = num.length-1; i >=0 ; i--) {
            System.out.println(num[i]);

        }
    }
}
