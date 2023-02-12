import java.util.Scanner;

public class Numcrecientedecre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        int num1 = sc.nextInt();
        System.out.println("introduce un numero");
        int num2 = sc.nextInt();
        int mayor = 0;
        int menor = 0;
        if (num1 > num2) {
            mayor = num1;
            menor = num2;
            System.out.println("los numeros ordenador son " + mayor + "," + menor);
        } else if (num2 > num1) {
            mayor = num2;
            menor = num1;
            System.out.println("los numeros ordenador son " + mayor + "," + menor);

        } else {
            System.out.println("son iguales");
        }
    }
}
