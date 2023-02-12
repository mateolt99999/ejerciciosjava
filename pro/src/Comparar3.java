import java.util.Scanner;

public class Comparar3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Pedir tres números y ordenarlos de mayor a menor
        System.out.println("introduce 3 numeros");
        int num1=sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        if (num1>num2 && num2>num3){
            System.out.println(num1 + "," +num2 + "," +num3);
        }
        else if (num2 >num1 && num1>num3){
            System.out.println(num2 + "," +num1 + "," +num3);
        }
        else if (num3 >num1 && num2>num3){
            System.out.println(num3 + "," +num1 + "," +num2);
        }
        else if (num1 >num3 && num3>num2){
            System.out.println(num1 + "," +num3 + "," +num2);
        }
        else if (num2 >num3 && num3>num1){
            System.out.println(num2 + "," +num3 + "," +num1);
        }
        else if (num3 >num2 && num2>num1){
            System.out.println(num3 + "," +num2 + "," +num1);
        }
        else if (num3 >num1 && num1>num2){
            System.out.println(num3 + "," +num1 + "," +num2);
        }





    }
}
