package ar.edu.uade.adoo.ejemplos.clase11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Paquete extends Producto {
    private List<Producto> servicios;

    public Paquete() {
        this.servicios = new ArrayList<>();
    }

    public void agregarServicio(Producto servicio) {
        this.servicios.add(servicio);
    }

    @Override
    public Float getPrecio() {
        return this.servicios.stream().collect(Collectors.summingDouble(s -> s.getPrecio())).floatValue();
    }

    @Override
    public void agregarProducto(Producto producto) {
        this.servicios.add(producto);
    }
}
