package punto2;

import javax.swing.*;
import java.awt.*;

public class Canva extends JPanel {
    private java.util.List<Figura> figuras;

    public Canva() {
        figuras = new java.util.ArrayList<>();
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        var panel = new AdapterPanel(g2d);
        for (Figura figura : figuras) {
            figura.dibujar(panel);
        }
    }
}