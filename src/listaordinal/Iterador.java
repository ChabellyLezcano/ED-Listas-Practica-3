package listaordinal;

public class Iterador {
    private Nodo actual;

    public Iterador(Nodo inicio) {
        actual = inicio;
    }

    public boolean hasNext() {
        return actual != null;
    }

    public Producto next() {
        if (!hasNext()) {
            return null;
        }
        Producto resultado = actual.getDato();
        actual = actual.getSiguiente();
        return resultado;
    }
}
