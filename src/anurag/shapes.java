package anurag;

import javax.swing.*;
import java.awt.*;

public class DrawShapes extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(50, 50, 100, 50);  // Draw rectangle
        g.drawOval(200, 50, 100, 50); // Draw oval
        g.drawLine(50, 150, 200, 150); // Draw line
        g.drawString("Hello, Graphics!", 50, 200); // Draw text
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawShapes panel = new DrawShapes();
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}