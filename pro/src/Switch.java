import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("introduce un numero");
        int dia=sc.nextInt();
        switch (dia){
            case 1:
                System.out.println("es lunes");
                break;
            case 2:
                System.out.println("es martes");
                break;
            case 3:
                System.out.println("es miercoles");
                break;
            case 4:
                System.out.println("es jueves");
                break;
                case 5:
                System.out.println("es viernes");
                break;
            case 6:
                System.out.println("es sabado");
                break;
            case 7:
                System.out.println("es domingo");
                break;
            default:
                System.out.println("introduce otro numero");
        }


    }
}
