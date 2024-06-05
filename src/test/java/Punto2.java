import punto2.*;

import javax.swing.*;

public class Punto2 extends JFrame {
    public Punto2() {
        super("Dibujar Figuras");

        Canva canvas = new Canva();
        canvas.agregarFigura(new Linea(new Coordenada(50, 50), 200));
        canvas.agregarFigura(new Circulo(new Coordenada(200, 200), 50));
        canvas.agregarFigura(new Texto(new Coordenada(100, 300), "Hola Mundo"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        getContentPane().add(canvas);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Punto2 frame = new Punto2();
            frame.setVisible(true);
        });
    }
}