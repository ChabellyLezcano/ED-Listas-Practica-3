package listaordinal;

import java.util.LinkedList;

public class FacturaBib {
    private final String dniCliente;
    private final String fecha;
    private final LinkedList<Producto> productos;

    public FacturaBib(String dniCliente, String fecha) {
        this.dniCliente = dniCliente;
        this.fecha = fecha;
        this.productos = new LinkedList<Producto>();
    }

    public void addProducto(Producto p) {
        productos.add(p);
    }

    public void removeProducto(Producto p) {
        productos.remove(p);
    }

    public LinkedList<Producto> getProductos() {
        return productos;
    }

    public float getTotal() {
        float total = 0;
        for (Producto p : productos) {
            total += p.getPrecio() * p.getUnidades();
        }
        return total;
    }

    public LinkedList<Producto> getProductosConPrecioSuperiorA(float precio) {
        LinkedList<Producto> productosFiltrados = new LinkedList<Producto>();
        for (Producto p : productos) {
            if (p.getPrecio() > precio) {
                productosFiltrados.add(p);
            }
        }
        return productosFiltrados;
    }

    public void mostrar() {
        System.out.println("FACTURA de: " + dniCliente + ". Fecha: " + fecha);
        for (Producto p : productos) {
            p.mostrar();
        }
        System.out.println("IMPORTE TOTAL: " + getTotal() + " €");
    }

}
