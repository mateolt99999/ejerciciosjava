import java.util.Scanner;

public class Distintos {
    public static void main(String[] args) {
        //Solicitar dos números distintos y decir cuál es el mayor
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numeros distintos");
        int num1 = sc.nextInt();
        System.out.println("introduce un numero distinto");
        int num2 = sc.nextInt();
        if (num1 == num2) {
            System.out.println("son iguales");
        } else if (num1 > num2) {
            System.out.println("el primer numero es mayor que el segundo");
        } else  {
            System.out.println("el segundo es mayor que el primero");
        }
    }
}


