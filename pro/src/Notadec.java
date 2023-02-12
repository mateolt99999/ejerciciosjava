import java.util.Scanner;

public class Notadec {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("introduce la nota del primer examen");
        double notaPrimerexamen=sc.nextDouble();
        System.out.println("introduce la nota del segundo examen");
        double notaSegundoexamen=sc.nextDouble();
        System.out.println("introduce la nota del tercer examen");
        Double tercerexamen= sc.nextDouble();
        int media=(int)(notaSegundoexamen +notaPrimerexamen+ tercerexamen)/3;
        System.out.println("tienes una media de " + media);
    }
}
