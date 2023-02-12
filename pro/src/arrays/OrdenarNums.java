package arrays;

import java.util.Scanner;

public class OrdenarNums {
    public static void main(String[] args) {
        //recibir 3 x teclado
        Scanner sc = new Scanner(System.in);
        int num[] = new int[3];
        num[0] = sc.nextInt();
        num[1] = sc.nextInt();
        num[2] = sc.nextInt();
ordenar(num);
    }

    public static void ordenar(int[] enteros) {
        int num1=enteros[0];
        int num2=enteros[1];
        int num3=enteros[2];

        if (num1 > num2 && num2 > num3) {
            System.out.println(num1 + "," + num2 + "," + num3);
        } else if (num2 > num1 && num1 > num3) {
            System.out.println(num2 + "," + num1 + "," + num3);
        } else if (num3 > num1 && num2 > num3) {
            System.out.println(num3 + "," + num1 + "," + num2);
        } else if (num1 > num3 && num3 > num2) {
            System.out.println(num1 + "," + num3 + "," + num2);
        } else if (num2 > num3 && num3 > num1) {
            System.out.println(num2 + "," + num3 + "," + num1);
        } else if (num3 > num2 && num2 > num1) {
            System.out.println(num3 + "," + num2 + "," + num1);
        } else if (num3 > num1 && num1 > num2) {
            System.out.println(num3 + "," + num1 + "," + num2);
        }
    }

}
