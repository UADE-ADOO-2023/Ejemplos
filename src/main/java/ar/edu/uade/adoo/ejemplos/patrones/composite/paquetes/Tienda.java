package ar.edu.uade.adoo.ejemplos.patrones.composite.paquetes;

public class Tienda {
    public static void main(String[] args) {
        Carrito carrito = new Carrito();
        // Vendedor 1: Shampoo sin paquete
        Pedido shampoo = new Producto("Shampoo", 2500f);
        carrito.agregarPedido(shampoo);
        // Vendedor 2: Placa de video (en su paquete de $15) + motherboard, todo en otro paquete de $0
        Pedido paqueteVendedor2 = new Paquete(0f);
        Pedido placaVideoPaquete = new Paquete(15f);
        Pedido placaVideo = new Producto("GeForce RTX 4090", 2500000f);
        placaVideoPaquete.agregarPedido(placaVideo);
        Pedido motherboard = new Producto("ASUS ROG Strix Z790-E Gaming", 550000f);
        paqueteVendedor2.agregarPedido(placaVideoPaquete);
        paqueteVendedor2.agregarPedido(motherboard);
        carrito.agregarPedido(paqueteVendedor2);
        // Vendedor 3: HDD en paquete de $0
        Pedido paqueteVendedor3 = new Paquete(0f);
        Pedido hdd = new Producto("Western Digital WD10EZEX 1TB", 50000f);
        paqueteVendedor3.agregarPedido(hdd);
        carrito.agregarPedido(paqueteVendedor3);
        // Cuanto duele la compra?
        System.out.println(carrito.getTotal());
    }
}
