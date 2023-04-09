package conjunto;

public class Algoritmos {
    public Conjunto interseccion(Conjunto conjunto1, Conjunto conjunto2) {
        Conjunto interseccion = new Conjunto();
        int[] array1 = conjunto1.toArray();
        int[] array2 = conjunto2.toArray();
        int i = 0, j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] == array2[j]) {
                interseccion.insertar(array1[i]);
                i++;
                j++;
            } else if (array1[i] < array2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return interseccion;
    }
}
