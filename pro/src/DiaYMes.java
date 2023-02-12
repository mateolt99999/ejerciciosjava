import java.util.Scanner;

public class DiaYMes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce el mes");
        int mes=sc.nextInt();
        System.out.println("introduce el dia");
        int dia=sc.nextInt();
        fechaCorrecta(dia,mes);
    }
    public static void fechaCorrecta(int dia, int mes){
        boolean fechaCorrecta=false;
        if ((dia<1 || dia>31)&& (mes<1 || mes>12)){
            fechaCorrecta=false;
        }
        else if (mes==2 && dia>28){
            fechaCorrecta=false;
        }
        else if ((mes==4||mes==6|| mes==9||mes==11) && dia>30){
            fechaCorrecta=false;
        }
        else{
            fechaCorrecta=true;
        }
        if (fechaCorrecta){
            System.out.println("la fecha es correcta");

        }
        else {
            System.out.println("la fecha es incorrecta");
        }

    }
}
