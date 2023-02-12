import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        /*
         *  Realiza un programa que calcule la nota que hace falta sacar en el segundo
         *      examen de la asignatura Programación** para obtener la media deseada.
         *      Hay que tener en cuenta que la nota del primer examen cuenta el 40% y la
         *      del segundo examen un 60%.
         *
         *      Ejemplo 1:
         *      Introduce la nota del primer examen: 7
         *      ¿Qué nota quieres sacar en el trimestre? 8.5
         *      Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.
         *
         *      Ejemplo 2:
         *      Introduce la nota del primer examen: 8
         *      ¿Qué nota quieres sacar en el trimestre? 7
         *      Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen.
         *
         *
         */
        Scanner sc= new Scanner(System.in);
        System.out.println("introduce la nota del primer examen");

        double notaPrimerexamen=sc.nextDouble();
        System.out.println("introduce la nota que quieres en el trimestre");
        double notaQuequiereseneltrimestre=sc.nextDouble();
       double notasegundo=(notaQuequiereseneltrimestre -notaPrimerexamen*0.4)/0.6;
        System.out.println("necesitas en el segundo examen un " +notasegundo);
    }
}
