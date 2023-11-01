
package ar.edu.uade.adoo.ejemplos.patrones.proxy;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ProxyImagen implements Grafico{
    private Imagen imagen;

    public ProxyImagen(String path) {
        this.imagen = new Imagen(path);
    }

    @Override
    public void dibujar() {
        if (!imagen.estaCargada()) {
            System.out.println("Thumbnail/placeholder");
        } else {
            this.imagen.dibujar();
        }
    }

    @Override
    public void cargar() {
        if (!imagen.estaCargada()) {
            this.imagen.cargar();
        }
    }
}
