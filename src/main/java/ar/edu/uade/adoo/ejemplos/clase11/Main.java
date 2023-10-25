package ar.edu.uade.adoo.ejemplos.clase11;

public class Main {
    public static void main(String[] args) {
        Producto internet = new Internet();
        Producto tv = new Television();
        Producto paquete = new Paquete();
        paquete.agregarProducto(tv);
        Producto descuentoInternet = new DescuentoFibertel(internet);
        paquete.agregarProducto(descuentoInternet);
        System.out.println(paquete.getPrecio());
        Producto descuentoGeneral = new DescuentoMundial(paquete);
        System.out.println(descuentoGeneral.getPrecio());
    }
}
