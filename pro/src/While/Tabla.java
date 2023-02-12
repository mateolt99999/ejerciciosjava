package While;

import java.util.Scanner;

public class Tabla {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce un numero");
        int num=sc.nextInt();
        int contador=0;
        while (contador<=10){

            System.out.println(num +"x"+ contador +"="  + num*contador);
            contador++;

        }
    }
}
