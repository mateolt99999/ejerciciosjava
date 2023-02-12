package While;

import java.util.Scanner;

public class Contar {
    public static void main(String[] args) {
        // Escribir una aplicación para aprender a contar, que pedirá
        // un número n por teclado y mostrará los números del 1 al n
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce n");
        int n= sc.nextInt();
        int a=1;
        while (a<=n){
            System.out.println(a);
            a++;
        }

    }
}
