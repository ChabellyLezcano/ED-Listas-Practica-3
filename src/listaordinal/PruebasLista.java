package listaordinal;

import java.util.LinkedList;

public class PruebasLista {
    public static void main(String[] args) {
        System.out.println("Apartado 1:");

        Producto p1 = new Producto("Mesa escritorio", 185, 2);
        Producto p2 = new Producto("Silla oficina", 95.9f, 3);
        Producto p3 = new Producto("Mesa cocina", 125);
        Producto p4 = new Producto("Sillón reclinable", 230, 2);

        // Insertarlos ese orden en una lista ordinal de productos.
        ListaOrdinal lista = new ListaOrdinal();
        lista.insertar(p1);
        lista.insertar(p2);
        lista.insertar(p3);
        lista.insertar(p4);

        // Visualizar el contenido de la lista utilizando el método mostrar.
        System.out.println("---------- PRODUCTOS EN LA LISTA -----------");
        Iterador iter = lista.getIterador();
        while (iter.hasNext()) {
            Producto p = iter.next();
            p.mostrar();
        }

        // Eliminar las tres sillas de oficina.
        lista.borrar(new Producto("Silla oficina", 95.9f));

        // Volver a mostrar el contenido de la lista.
        System.out.println("Después de borrar las sillas de oficina:");
        iter = lista.getIterador();
        while (iter.hasNext()) {
            Producto p = iter.next();
            p.mostrar();
        }

        System.out.println("\nApartado 2 y 3:");
        Factura factura = new Factura("12345678B", "17/03/2021");

        // Añadir productos a la factura
        Producto mesaEscritorio = new Producto("Mesa escritorio", 185.0f, 2);
        Producto sillaOficina1 = new Producto("Silla oficina", 95.9f, 4);
        Producto mesaCocina = new Producto("Mesa cocina", 125.0f, 1);
        Producto sillonReclinable = new Producto("Sillón reclinable", 230.0f, 2);
        factura.añadirProducto(mesaEscritorio);
        factura.añadirProducto(sillaOficina1);
        factura.añadirProducto(mesaCocina);
        factura.añadirProducto(sillonReclinable);

        // Mostrar contenido de la factura
        factura.mostrar();

        System.out.println("IMPORTE TOTAL: " + factura.importeTotal() + " €");
        System.out.println("Apartado 4:");

        // Eliminar productos de la factura
        Producto sillaOficina2 = new Producto("Silla oficina", 95.9f, 2);
        Producto sillonReclinable2 = new Producto("Sillón reclinable", 230.0f, 3);
        int unidadesEliminadas1 = factura.eliminarProducto(sillaOficina2);
        int unidadesEliminadas2 = factura.eliminarProducto(sillonReclinable2);

        // Mostrar número de unidades eliminadas
        System.out.println("Se han eliminado " + (unidadesEliminadas1 + unidadesEliminadas2) + " unidades");

        // Mostrar contenido de la factura
        factura.mostrar();
        while (iter.hasNext()) {
            Producto p = iter.next();
            p.mostrar();
        }
        System.out.println("IMPORTE TOTAL: " + factura.importeTotal() + " €");


        System.out.println("Apartado 5:");
        // Obtener una lista de productos con un precio superior a 100 € por unidad
        ListaOrdinal listaMayoresPrecios = factura.mayoresPrecios(100);

        // Mostrar un mensaje indicativo del número de productos obtenidos
        System.out.println("Se han obtenido " + listaMayoresPrecios.getNumElementos() + " productos con precio mayor a 100 € por unidad.");

        // Mostrar el contenido de la lista obtenida
        Iterador iterador = listaMayoresPrecios.getIterador();
        while (iterador.hasNext()) {
            Producto p = iterador.next();
            p.mostrar();
        }

        System.out.println("\n*****Prueba FacturaBib*****");
        FacturaBib facturaBib = new FacturaBib("88888888A", "08/08/2008");

        Producto armario = new Producto("Armario", 385, 4);
        Producto cama1 = new Producto("Cama", 255, 5);


        facturaBib.addProducto(armario);
        facturaBib.addProducto(cama1);

        facturaBib.mostrar();

        LinkedList<Producto> productosFiltrados = facturaBib.getProductosConPrecioSuperiorA(250);
        System.out.println("Se han obtenido " + productosFiltrados.size() + " productos con precio mayor a 250 € por unidad");
        for (Producto p : productosFiltrados) {
            p.mostrar();
        }

    }
}
