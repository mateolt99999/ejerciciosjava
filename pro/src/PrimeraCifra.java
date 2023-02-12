import java.util.Scanner;

public class PrimeraCifra {
    public static void main(String[] args) {
        //Escribe un programa que diga cuál es la primera cifra de un número entero
        //introducido por teclado. Se permiten números de hasta 5 cifras
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero de menos 5 cifras");
        int num = sc.nextInt();
        int prim = 0;

        if (num < 10) {
            prim = num;
        }
        if (num >= 10 && num < 100) {
            prim = num / 10;
        }
        if (num >= 100 && num < 1000) {
            prim = num / 100;
        }
        if (num >= 1000 && num < 10000) {
            prim = num / 1000;
        }
        if (num >= 10000) {
            prim = num / 10000;
        }
        System.out.println("la primera cifra es " +prim);
    }
}
