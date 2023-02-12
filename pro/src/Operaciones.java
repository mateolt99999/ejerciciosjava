import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        //Escribe un programa que sume, reste, multiplique y divida dos números introducidos por teclado.
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int num= sc.nextInt();
        System.out.println("introudca num2");

        int num2= sc.nextInt();
        System.out.println("Esta es la suma de los numeros");
        System.out.println(num+num2);
        System.out.println("Esta es la resta de los numeros");
        System.out.println(num-num2);
        System.out.println("Esta es la multiplicacion de los numeros");
        System.out.println(num*num2);
        System.out.println("Esta es la division de los numeros");
        System.out.println((double) num/num2);
int suma=num+num2;
int resta=num-num2;
int multiplicacion=num*num2;
double division=(double) num/num2;
        System.out.println("la suma es igual a "+ suma);
        System.out.println("la resta es igual a "+ resta);
        System.out.println("la multiplicacion es igual a "+ multiplicacion);
        System.out.println("la division es igual a "+ division);


    }
}

