package While;

public class Mult5 {
    public static void main(String[] args) {
        //Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
        int contador=0;
        while(contador<=100){
            if (contador%5==0){
                System.out.println(contador);
            }
            contador++;


        }
    }
}
