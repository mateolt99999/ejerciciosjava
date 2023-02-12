import java.util.Scanner;

public class Horacondicion {
    public static void main(String[] args) {
        //Realiza un programa que pida una hora por teclado y que muestre luego
        //buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los
        //tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en
        //cuenta las horas, los minutos no se deben introducir por teclado.
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime la hora que es en formato 24 horas");
        int hora=sc.nextInt();
        if (hora>=6 && hora<=12){
        System.out.println("buenos dias");
        } else if (hora>=13 && hora<=20) {
            System.out.println("buenas tardes");
        } else if( (hora>=21 && hora<=24)||( hora>=1 && hora<=5)){
            System.out.println("buenas noches");

            }

        }


    }

