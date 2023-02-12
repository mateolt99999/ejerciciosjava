import java.util.Scanner;

public class If {
    public static void main(String[] args) {
//Diseñar una aplicación que solicite al usuario un número e indique si es par o impar
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce numero");
        int num = sc.nextInt();
        if (num %2==0){
            System.out.println("tu numero es par");
        }
        else {
            System.out.println("es impar");
        }
    }

}