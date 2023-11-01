package ar.edu.uade.adoo.ejemplos.patrones.proxy;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Imagen implements Grafico{
    private BufferedImage imagen;
    private String path;
    private Boolean cargada;

    public Imagen(String path) {
        this.path = path;
        this.cargada = false;
    }

    @Override
    public void dibujar() {
        //NOTA: ESTO VIOLA EL PRINCIPIO ARQUITECTURAL BASICO DE SEPARACION DE ASPECTOS
        JLabel label = new JLabel(new ImageIcon(this.imagen));
        JPanel panel = new JPanel();
        panel.add(label);
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(this.imagen.getWidth(), this.imagen.getHeight()));
        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void cargar() {
        try {
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
            this.imagen = ImageIO.read(classloader.getResourceAsStream(this.path));
            this.cargada = true;
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }

    public Boolean estaCargada() {
        return cargada;
    }
}
