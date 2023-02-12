import java.util.Scanner;

class main {
    public static void main(String[] args) {

        // conversor de dolar a euros. La cantidad de dolar que se quiere convertir se debe pasar por teclado
        Scanner sc= new Scanner(System.in);
System.out.println("introduza un numero");
        double dolar=sc.nextInt();
        double euro=dolar/0.94;
        System.out.println("son "+ euro);
    }
}