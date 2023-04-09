package listaordinal;

public class Factura {
    private final String dni;
    private final String fecha;
    private final ListaOrdinal listaProductos;
    private boolean cobrada;

    public Factura(String dni, String fecha) {
        this.dni = dni;
        this.fecha = fecha;
        listaProductos = new ListaOrdinal();
        cobrada = false;
    }

    public String getDNI() {
        return dni;
    }

    public String getFecha() {
        return fecha;
    }

    public boolean estaCobrada() {
        return cobrada;
    }

    public void cobrada() {
        cobrada = true;
    }

    public void añadirProducto(Producto producto) {
        boolean encontrado = false;
        Iterador iter = listaProductos.getIterador();
        while (iter.hasNext() && !encontrado) {
            Producto p = iter.next();
            if (p.equals(producto)) {
                p.setUnidades(p.getUnidades() + producto.getUnidades());
                encontrado = true;
            }
        }
        if (!encontrado) {
            listaProductos.insertar(producto);
        }
    }

    public void mostrar() {
        System.out.println("FACTURA de: " + dni + ". Fecha: " + fecha);
        Iterador iter = listaProductos.getIterador();
        while (iter.hasNext()) {
            Producto p = iter.next();
            p.mostrar();

        }
    }

    public float importeTotal() {
        float total = 0.0f;
        Iterador iter = listaProductos.getIterador();
        while (iter.hasNext()) {
            Producto p = iter.next();
            total += p.getPrecio() * p.getUnidades();
        }
        return total;
    }

    public int eliminarProducto(Producto producto) {
        int unidadesEliminadas = 0;
        Iterador iter = listaProductos.getIterador();
        while (iter.hasNext()) {
            Producto p = iter.next();
            if (p.equals(producto)) {
                int unidadesRestantes = p.getUnidades() - producto.getUnidades();
                if (unidadesRestantes > 0) {
                    p.setUnidades(unidadesRestantes);
                    unidadesEliminadas = producto.getUnidades();
                } else {
                    unidadesEliminadas = p.getUnidades();
                    listaProductos.borrar(p);
                }
                break;
            }
        }
        return unidadesEliminadas;
    }

    public ListaOrdinal mayoresPrecios(float precio) {
        ListaOrdinal listaMayoresPrecios = new ListaOrdinal();
        Iterador iter = listaProductos.getIterador();
        while (iter.hasNext()) {
            Producto p = iter.next();
            if (p.getPrecio() > precio) {
                listaMayoresPrecios.insertar(p);
            }
        }
        return listaMayoresPrecios;
    }

}




































//Esta practica ha sido realizada por Chabelly Lezcano
