package projetocg.V;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import projetocg.M.Ponto;

 
/**
 *
 * @author Evelyn
 */
public class BresenhamPanel extends JFrame {

}
class Bresenham extends JPanel {
    final int centerX, centerY;
    ArrayList<Ponto> pontosNovos;
    int numPontos;
    int w;
    int h;
    
    public Bresenham(ArrayList<Ponto> pontosNovos, int numPontos) {
        this.pontosNovos = pontosNovos;
        this.numPontos = numPontos;
        w = 600;
        h = 500;
        centerX = w / 2;
        centerY = h / 2;
        setPreferredSize(new Dimension(w, h));
        setBackground(Color.white);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int i;
        for(i=0; i<numPontos-1; i++){
            drawLine(g,pontosNovos.get(i).getX(),  pontosNovos.get(i).getY(), 
                       pontosNovos.get(i+1).getX(),pontosNovos.get(i+1).getY());
        }
            drawLine(g,pontosNovos.get(i).getX(),pontosNovos.get(i).getY(), 
                       pontosNovos.get(0).getX(),pontosNovos.get(0).getY());
    }
 
    public void plot(Graphics g, int x, int y) {
         g.setColor(Color.MAGENTA);
         g.drawLine(x ,y, x, y);
    }
    
    public void drawLine(Graphics g, int x1, int y1, int x2, int y2) {
        int d = 0;
 
        int dy = Math.abs(y2 - y1);
        int dx = Math.abs(x2 - x1);
 
        int dy2 = (dy << 1); // slope scaling factors to avoid floating
        int dx2 = (dx << 1); // point
 
        int ix = x1 < x2 ? 1 : -1; // increment direction
        int iy = y1 < y2 ? 1 : -1;
 
        if (dy <= dx) {
            for (;;) {
                plot(g, x1, y1);
                if (x1 == x2)
                    break;
                x1 += ix;
                d += dy2;
                if (d > dx) {
                    y1 += iy;
                    d -= dx2;
                }
            }
        } else {
            for (;;) {
                plot(g, x1, y1);
                if (y1 == y2)
                    break;
                y1 += iy;
                d += dx2;
                if (d > dy) {
                    x1 += ix;
                    d -= dy2;
                }
            }
        }
    }
}
