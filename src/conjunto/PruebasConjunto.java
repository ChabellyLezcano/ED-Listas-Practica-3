package conjunto;

import java.util.Arrays;


public class PruebasConjunto {

    public static void main(String[] args) {
        System.out.println("*****Parte Conjunto*****");
        System.out.println("\nApartado 5.1");
        // Crear un objeto de la clase Conjunto.
        Conjunto conjunto = new Conjunto();

        // Insertar en el conjunto los siguientes elementos: 4, 6, 2, 4, -2.
        conjunto.insertar(4);
        conjunto.insertar(6);
        conjunto.insertar(2);
        conjunto.insertar(4);
        conjunto.insertar(-2);

        // Mostrar el conjunto resultante.
        System.out.print("Conjunto de trabajo: ");
        conjunto.mostrar();

        System.out.println("\nApartado 5.2");
        int[] array = conjunto.toArray();

        // Imprimir cada elemento del array.
        System.out.print("El array contiene: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n\nApartado 5.3");

        // Obtener el mayor elemento del conjunto.
        int mayor = conjunto.mayor();
        if (mayor == -1) {
            System.out.println("El conjunto está vacío.");
        } else {
            System.out.println("El mayor elemento es: " + mayor);
        }

        System.out.println("\nApartado 5.4");

        Conjunto subconjunto = conjunto.subconjunto(3, 6);
        System.out.print("El subconjunto entre 3 y 6 es: ");
        subconjunto.mostrar();

        System.out.println("\nApartado 5.5");
        Conjunto conjunto1 = new Conjunto();
        conjunto1.insertar(2);
        conjunto1.insertar(4);

        Conjunto conjunto2 = new Conjunto();
        conjunto2.insertar(2);
        conjunto2.insertar(4);
        conjunto2.insertar(6);

        // Imprimir el contenido de los conjuntos como arrays legibles
        System.out.println("Un conjunto es: " + Arrays.toString(conjunto1.toArray()));
        System.out.println("Es igual que el conjunto de trabajo? " + Arrays.equals(conjunto1.toArray(), conjunto2.toArray()));

        conjunto1.insertar(6);

        System.out.println("Un conjunto es: " + Arrays.toString(conjunto1.toArray()));
        System.out.println("Es igual que el conjunto de trabajo? " + Arrays.equals(conjunto1.toArray(), conjunto2.toArray()));


        System.out.println("\nApartado 6.1");
        Conjunto nuevoConjunto = new Conjunto();
        nuevoConjunto.insertar(4);
        nuevoConjunto.insertar(5);

        Algoritmos algoritmos = new Algoritmos();
        Conjunto interseccion = algoritmos.interseccion(conjunto, nuevoConjunto);


        System.out.print("La interseccion de " + Arrays.toString(nuevoConjunto.toArray()) + " con el de trabajo es: ");
        interseccion.mostrar();

        //Esta practica ha sido realizada por Chabelly Lezcano
    }
}





