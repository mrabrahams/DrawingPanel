import java.awt.*;

public class wbr222_DrawingPanel {
    public static void main (String [] args){
        DrawingPanel panel = new DrawingPanel(300, 200);
        Graphics pen = panel.getGraphics();

        Color magenta = new Color(255, 0, 255);
        Color green   = new Color(0, 255, 0);

        pen.setColor(green);
        pen.fillRect(50, 30, 200, 150);
        //creation of rectangle
        pen.setColor(Color.BLACK);
        pen.drawLine(50,30,50,179);//left wall of rectangle
        pen.drawLine(249,30,249,179);//right wall of rectangle
        pen.drawLine(50,30,249,30);//top wall of rectangle
        pen.drawLine(50,179,249,179);//bottom wall of rectangle

        pen.setColor(Color.BLACK);
        pen.fillOval(77, 30, 150, 150);//black circle serves as border for red circle
        pen.setColor(Color.RED);
        pen.fillOval(78, 31, 148, 148);//smaller red circle

        pen.setColor(Color.YELLOW);
        pen.drawLine(50,30,249,179);//left to bottom right line
        pen.drawLine(249,30,50,179);// right to bottom left line

        pen.setColor(magenta);
        pen.drawString("Dwight Abrahams", 10, 15);
    }
}
