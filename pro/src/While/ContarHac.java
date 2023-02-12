package While;

public class ContarHac {
    public static void main(String[] args) {
        //Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
        //utilizando un bucle while.
        int contador=320;
        while (contador>=160){
            System.out.println(contador);
            contador-=20;
        }
    }
}
