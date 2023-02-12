import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un dia de la semana");
        int dia = sc.nextInt();

        if (dia == 1) {
            System.out.println("es lunes");
        } else if (dia == 2) {
            System.out.println("es martes");
        } else if (dia == 3) {
            System.out.println("es miercoles");
        } else if (dia == 4) {
            System.out.println("es jueves");
        } else if (dia==5) {
            System.out.println("es viernes");
        } else if (dia==6) {
            System.out.println("es sabado");
        } else if (dia==7) {
            System.out.println("es domingo");
        }else {
            System.out.println("el numero introducido no es correcto");
        }


    }
}
