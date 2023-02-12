package buclefor;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        //Desarrollar un programa que solicite un número
       // mínimo y un máximo y cuente los números comprendidos entre ellos
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce el maximo");
        int max=sc.nextInt();
        System.out.println("introduce el minimo");
                int min= sc.nextInt();
        for (int i=min;i<=max;i++){
            System.out.println(i);
        }
    }
}
