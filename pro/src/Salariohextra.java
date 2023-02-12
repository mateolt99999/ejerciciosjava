import java.util.Scanner;

public class Salariohextra {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce horas trabajadas");
        int horas=sc.nextInt();
        double precio=12;
        double extra=16;
        int horaNormal=40;
        if (horas<=40){
            System.out.println("las horas que trabajas son" + precio*horas);
        } else{
            double salarioExtra=((horas-horaNormal) *extra);
            double salarioNormal= horas*precio;
            System.out.println("las horas que trabajas son" +(salarioExtra+salarioNormal));

        }
    }
}
