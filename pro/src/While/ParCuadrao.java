package While;

import java.util.Scanner;

public class ParCuadrao {
    public static void main(String[] args) {
        //Diseñar un programa que muestre para cada número introducido por teclado si es par,
        // si es positivo, y su cuadrado. El proceso se repetirá hasta que el número introducido sea 0
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce numero");
        int num= sc.nextInt();
        while (num!=0){
            if (num%2==0){
                System.out.println("es par");
            }else {
                System.out.println("es impar");}
            if (num>=0){
                System.out.println("es positivo");
            }else {
                System.out.println("es negativo");}
            System.out.println("el cuadrado sería "+ num *num);

            System.out.println("introduce numero");
          num= sc.nextInt();

        }
    }
}
