import java.util.Scanner;

public class Iva {
    public static void main(String[] args) {
        //Un economista nos ha encargado un programa para realizar cáculos con el IVA. La aplicación debe
        // solicitar la base imponible y el IVA a aplicar.
        // Debemos mostrar en pantalla el importe correspondiente al IVA y el total.
        Scanner sc= new Scanner(System.in);
        System.out.println("base");
        double base=sc.nextDouble();
        System.out.println("iva");
        double iva=sc.nextDouble();

        double cuotaIva=(base* iva/100);
        System.out.println("el total es " + cuotaIva);
        System.out.println("el precio total es " + (base+ cuotaIva));

    }
}
