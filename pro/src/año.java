import java.util.Scanner;

public class año {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce tu anio de nacimiento");
        int aniodenacimiento=sc.nextInt();
        System.out.println("introduce año actual");
        int anioactual=2022;
       anio(aniodenacimiento, anioactual);
    }
    public static void anio(int aniodenacimiento, int anioactual){

       int edad=anioactual-aniodenacimiento;
        System.out.println("esta es tu edad " + edad +" años ");
    }
}
