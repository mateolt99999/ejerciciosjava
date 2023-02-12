import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        //Escribe un programa que calcule el salario semanal de un empleado en base a las horas
        // trabajadas, a razón de 12 euros la hora.
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce horas trabajadas");
        int horas=sc.nextInt();
        double precio=12;
        System.out.println("salario semanal es");
        System.out.println(precio*horas);

    }
}
