import java.util.Scanner;

public class Mediaritmetica {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce la primera nota");
        int nota1=sc.nextInt();
        System.out.println("introduce la segunda nota");
        int nota2= sc.nextInt();
       double media=(nota1+nota2)/2.0;
       System.out.println("la media es " + media);
    }
}
