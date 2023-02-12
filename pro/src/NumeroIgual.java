import java.util.Scanner;

public class NumeroIgual {
    public static void main(String[] args) {
        //Pedir dos números enteros y decir si son iguales o no
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce un numero");
        int num1=sc.nextInt();
        System.out.println("introduce un numero");
        int num2= sc.nextInt();
        if (num1==num2){
            System.out.println("son iguales");
        }
        else {
            System.out.println("no son iguales");
        }
    }
}
