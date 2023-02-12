package While;

import java.util.Scanner;

public class Num10 {
    public static void main(String[] args) {
        //Escribe un programa que lea una lista de diez números y determine cuántos
       // son positivos, y cuántos son negativos.
        Scanner sc=new Scanner(System.in);
        int num;

        int contador=0;
        int positivos=0;
        int negativos=0;
        while (contador<10){
            System.out.println("introduce numero");
            num= sc.nextInt();
            contador++;
            if (num>0){
            positivos++;
            }
             else if ( (num<0)) {
                 negativos++;
            }



        }
        System.out.println(" existen " + positivos +" numeros positivos existen " +negativos +" numero negativos ");
    }
}
