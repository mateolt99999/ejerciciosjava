package arrays;

public class Enteros12 {
    public static void main(String[] args) {
        //Define un array de 12 números enteros con nombre num y asigna los valores
        //según la tabla que se muestra a continuación. Muestra el contenido de todos
        //los elementos del array
        int num[]=new int[12];

        num[0]=39;
        num[1]=-2;
        num[4]=0;
        num[6]=14;
        num[8]=5;
        num[9]=120;
        haciaDelante(num);
        haciaAtras(num);
        imprimirPosicion(num,6);
    }
    public static void haciaDelante(int[]num){
        for (int i = 0; i < num.length ; i++) {
            System.out.println(num[i]);
        }
    }
    public static void haciaAtras(int[]num){
        for (int i = num.length-1; i >= 0 ; i--) {
            System.out.println(num[i]);
        }
    }
    public static void imprimirPosicion(int[]num ,int posicion){
        System.out.println(num[posicion]);

    }
}
