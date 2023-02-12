package buclefor;

import java.util.Scanner;

public class Contar {
    public static void main(String[] args) {
       // Escribir una aplicación para aprender a contar, que pedirá
       // un número n por teclado y mostrará los números del 1 al n
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
