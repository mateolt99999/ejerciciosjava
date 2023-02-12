package arrays;

public class basico {
    public static void main(String[] args) {
        int[] enteros=new int[5]; //los valores del array se inicializan con el valor por defecto del tipo
        // de dato
        System.out.println("datos al inicio");
      recorrerArray(enteros);
        enteros[0]=1;
        enteros[1]=2;
        enteros[2]=4;
        enteros[3]=7;
        enteros[4]=15;
        System.out.println("datos al final");
        recorrerArray(enteros);
int [] nuevoArray={3,7,9,44,6,2,1,0};
        System.out.println("inicializado de principio");
        recorrerArray(nuevoArray);

    }
public static void recorrerArray(int[]enteros){
    for (int i = 0; i < enteros.length ; i++) {
        System.out.println(enteros[i]);
    }
}
}
