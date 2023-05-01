package ActividadDiez;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PuntoUno extends JApplet implements ActionListener {
    private static final long serialVersionUID = 1L;
    private Font font;
    private Color redColor;
    private Color blueColor;
    private Color backgroundColor;
    private JButton button;
    private boolean isBlue = false;
    
    public void init() {
        // La fuente es Arial con un tamaño de 18 y en cursiva
        font = new Font("Arial", Font.ITALIC, 18);
        // Algunos colores están predefinidos en la clase Color
        redColor = Color.red;
        backgroundColor = Color.orange;
        // Los colores se pueden crear utilizando valores de Rojo, Verde y Azul
        blueColor = new Color(0, 0, 122);

        // Establecer el color de fondo del applet
        setBackground(backgroundColor);

        // Crear un botón
        button = new JButton("Cambiar color");
        // Agregar el botón al applet
        add(button);
        // Agregar un listener para detectar cuando se presiona el botón
        button.addActionListener(this);
    }

    /**
     * Este método dibuja las formas en la pantalla
     */
    public void paint(Graphics graph) {
        super.paint(graph);
        // Establecer la fuente
        graph.setFont(font);
        // Crear un título
        graph.drawString("Dibujar formas", 90, 20);
        // Establecer el color para la primera forma
        if (isBlue) {
            graph.setColor(blueColor);
        } else {
            graph.setColor(redColor);
        }
        // Dibujar un rectángulo utilizando drawRect(int x, int y, int width, int height)
        graph.drawRect(120, 120, 120, 120);
        // Esto rellenará un rectángulo
        graph.fillRect(115, 115, 90, 90);
        // Establecer el color para la siguiente forma
        graph.setColor(Color.CYAN);
        // Dibujar otro rectángulo
        graph.drawRect(50, 50, 50, 50);

        // Esto rellenará un rectángulo
        graph.fillRect(50, 50, 60, 60);
        // Establecer el color para la siguiente forma
        if (isBlue) {
            graph.setColor(redColor);
        } else {
            graph.setColor(blueColor);
        }
        // Dibujar un círculo utilizando drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
        graph.fillArc(110, 110, 50, 50, 0, 360);
    }
    
    public void actionPerformed(ActionEvent e) {
        // Cambiar el valor de isBlue para que la forma cambie de color
        isBlue = !isBlue;
        // Repintar el applet para que se muestre el cambio
        repaint();
    }
}