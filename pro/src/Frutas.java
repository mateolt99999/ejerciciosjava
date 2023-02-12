import java.util.Scanner;

public class Frutas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        final double PRECIO_MANZANA = 2.35;
        final double PRECIO_PERA = 1.95;
        System.out.println("introduce kilos de manzana en el primer trimestre");
        double kilos=sc.nextDouble();
        System.out.println("introduce kilos de manzana en el segundo trimestre");
        double kilos2= sc.nextDouble();
        System.out.println("introduce kilos de manzana en el tercer trimestre");
        double kilos3= sc.nextDouble();
        System.out.println("introduce kilos de manzana en el cuarto trimestre");
        double kilos4= sc.nextDouble();
        System.out.println("introduce kilos de pera en el primer trimestre");
        double kgpera1= sc.nextDouble();
        System.out.println("introduce kilos de pera en el segundo trimestre");
        double kgpera2= sc.nextDouble();
        System.out.println("introduce kilos de pera en el tercer trimestre");
        double kgpera3= sc.nextDouble();
        System.out.println("introduce kilos de pera en el cuarto  trimestre");
        double kgpera4= sc.nextDouble();

        double precio= kgpera1* PRECIO_PERA;

        double precio2= kgpera2* PRECIO_PERA;

        double precio3= kgpera3* PRECIO_PERA;

        double precio4= kgpera4*PRECIO_PERA;

        double precmanz= kilos*PRECIO_MANZANA;

        double precmanz2= kilos2*PRECIO_MANZANA;

        double precmanz3= kilos3*PRECIO_MANZANA;

        double precmanz4= kilos4*PRECIO_MANZANA;

        System.out.println("total de beneficios es " +(precmanz+precmanz2+precmanz3+precmanz4+precio+precio2+precio3+precio4));
        System.out.println("las manzanas cuestan"+ precmanz4);
        System.out.println("las manzanas cuestan en total" +precmanz4+precmanz2+precmanz3+precmanz);
        System.out.println("las peras cuestan en total"+precio+precio2+precio3+precio4);
    }
}
