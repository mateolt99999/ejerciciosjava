import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        //Escribe un programa que calcule el precio final de un producto según su
        //base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
        //reducido o superreducido) y el código promocional. Los tipos de IVA general,
        //reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos promocionales
        // pueden ser nopro, mitad, meno5 o 5porc que significan
        //respectivamente que no se aplica promoción, el precio se reduce a la mitad,
        //se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
        //muestran los valores correctos, aunque los números no estén tabulados.
       Scanner sc=new Scanner(System.in);
        System.out.println("introduce el precio inicial");
       double precio=sc.nextDouble();
        System.out.println("introduce el tipo de iva");
        double noproc=0;
        double mitad=0.5;
        double meno5=-5;
        double porc=0.05;
        System.out.println( precio -(precio *mitad));
        System.out.println(precio +(meno5));
        System.out.println(precio- noproc);
        System.out.println(precio-(precio*porc));


    }
}
