import java.util.Scanner;


public class SwitchOroscopo {
    public static void main(String[] args) {


        //Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un dia");
        int dia = sc.nextInt();
        System.out.println("introduce un mes");
        int mes = sc.nextInt();
        String horoscopo = null;
        switch (mes) {
            case 1:
                if (dia >= 20) {
                    horoscopo = "acuario";
                } else if (dia <= 19) {
                    horoscopo = "capricornio";
                }
                break;
            case 2:
                if (dia <= 18) {
                    horoscopo = "acuario";
                } else if (dia >= 19) {
                    horoscopo = "piscis";
                }
                break;
            case 3:
                if (dia <= 20) {
                    horoscopo = "piscis";
                } else if (dia >= 21) {
                    horoscopo = "aries";

                }
                break;
            case 4:
                if (dia <= 19) {
                    horoscopo = "ARIES";
                } else if (dia >= 20) {
                    horoscopo = "tauro";

                }
                break;
            case 5:
                if (dia <= 20) {
                    horoscopo = "tauro";
                } else if (dia >= 21) {
                    horoscopo = "geminis";

                }
                break;
            case 6:
                if (dia <= 20) {
                    horoscopo = "geminis";
                } else if (dia >= 21) {
                    horoscopo = "cancer";

                }
                break;
            case 7:
                if (dia <= 21) {
                    horoscopo = "cancer";
                } else if (dia >= 22) {
                    horoscopo = "leo";

                }
                break;
            case 8:
                if (dia <= 22) {
                    horoscopo = "leo";
                } else if (dia >= 23) {
                    horoscopo = "virgo";

                }
                break;
            case 9:
                if (dia <= 23) {
                    horoscopo = "virgo";
                } else if (dia >= 23) {
                    horoscopo = "libra";

                }
                break;
            case 10:
                if (dia <= 22) {
                    horoscopo = "libra";
                } else if (dia >= 23) {
                    horoscopo = "escorpio";

                }
                break;
            case 11:
                if (dia <= 21) {
                    horoscopo = "escorpio";
                } else if (dia >= 22) {
                    horoscopo = "sagitario";

                }
                break;
            case 12:
                if (dia <= 21) {
                    horoscopo = "sagitario";
                } else if (dia >= 22) {
                    horoscopo = "sagitario";

                }
                break;


        }
        System.out.println("tu horscopo es " + horoscopo);
    }
}
