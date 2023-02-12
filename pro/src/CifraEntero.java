import java.util.Scanner;

public class CifraEntero {
    public static void main(String[] args) {
       //Escribe un programa que diga cuál es la última cifra de un número entero
        //introducido por teclado.
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce un numero");
        int num=sc.nextInt();
        System.out.println("El ultimo numero es " + (num%10));

    }
}
