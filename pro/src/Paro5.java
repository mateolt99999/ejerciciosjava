import java.util.Scanner;

public class Paro5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("intorduce un numero");
        int num = sc.nextInt();
        if (num % 2 == 0 && num % 5 == 0) {
            System.out.println("es divisible por 2y por 5");
        } else if (num % 2 == 0) {
            System.out.println("es divisible por 2");
        } else if (num % 5 == 0) {
            System.out.println("es divisible por5");

        } else {
            System.out.println("no es divisible ni por 2 ni por 5");

        }
    }
}
