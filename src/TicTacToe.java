import javax.swing.*;
import java.awt.*;

public class TicTacToe extends JApplet {
    public void paint(Graphics canvas){
        canvas.drawLine(100,200,400,200);
        canvas.drawLine(100,300,400,300);
        canvas.drawLine(200,100,200,400);
        canvas.drawLine(300,100,300,400);
        canvas.drawLine(200,200,100,100);
        canvas.drawLine(100,200,200,100);
        canvas.drawLine(300,200,200,100);
        canvas.drawLine(200,200,300,100);
        canvas.drawLine(400,200,300,100);
        canvas.drawLine(300,200,400,100);
        canvas.drawLine(200,300,100,200);
        canvas.drawLine(100,300,200,200);
        canvas.drawLine(400,400,300,300);
        canvas.drawLine(300,400,400,300);
        canvas.drawLine(400,400,300,300);
        canvas.drawLine(300,400,400,300);
        canvas.drawOval(200,200,100,100);
        canvas.drawOval(300,200,100,100);
        canvas.drawOval(100,300,100,100);
        canvas.drawOval(200,300,100,100);


    }
}
