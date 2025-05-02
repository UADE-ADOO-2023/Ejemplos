package ar.edu.uade.adoo.ejemplos.clase7;

public class ModuloProductos {
    public static void main(String[] args) {
        Item guante = new Producto("Guante", 50000f);
        Item chaleco = new Producto("Chaleco", 150000f);
        Item combo = new Combo();
        combo.agregarItem(guante);
        combo.agregarItem(chaleco);
        System.out.println("Precio de combo guante + chaleco: " + combo.calcularPrecio());

        Item packaging = new Packaging(combo, 10000f);
        System.out.println("Precio de combo guante + chaleco con packaging con descuento para nuevos clientes: " + packaging.calcularPrecio());

        Item descuento = new Descuento(packaging, 0.25f);
        System.out.println("Precio de combo guante + chaleco con descuento: " + descuento.calcularPrecio());

        Item descuentoNuevoClientes = new Descuento(descuento, 0.1f);
        System.out.println("Precio de combo guante + chaleco con descuento para nuevos clientes: " + descuentoNuevoClientes.calcularPrecio());

        Item regalo = new Regalo(descuentoNuevoClientes);
        System.out.println("Precio de combo guante + chaleco con descuento para nuevos clientes con regalo: " + regalo.calcularPrecio());


    }
}
