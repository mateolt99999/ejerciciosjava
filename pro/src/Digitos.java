import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        //Realiza un programa que nos diga cuántos dígitos tiene un número entero que
        //puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        int num = sc.nextInt();
        num = Math.abs(num);
        int digitos = 0;
      numeroDigitos(digitos,num);
    }
    public static void numeroDigitos (int digitos,int num){
        if (num < 10) {
            digitos = 1;
        }
        if (num >= 10 && num<100) {
            digitos = 2;
        }
        if (num >= 100 && num<1000) {
            digitos = 3;
        }
        if (num >= 1000 && num<10000) {
            digitos = 4;
        }
        if (num >= 10000 && num<100000) {
            digitos = 5;
        }
        System.out.println("numero de cifras es " + digitos);
    }
}
