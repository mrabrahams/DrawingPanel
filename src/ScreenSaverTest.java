//ScreenSaver.java

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Scanner;

public class ScreenSaverTest{
    public static void main(String[] args) {
        // asking and reading text to be used as screensaver
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter text:");
        String str = scnr.nextLine();

        // creating a 500x500 drawing panel
        DrawingPanel drawPanel = new DrawingPanel(500, 500);
        // fetching graphics from the panel
        Graphics g = drawPanel.getGraphics();
        // using a bigger, custom font for text
        g.setFont(new Font("Arial Black", Font.BOLD, 16)); //fixme not created
        // fetchhing coordinates for bottom right corner
        int xPos = drawPanel.getWidth() - 1, yPos = drawPanel.getHeight() - 1;


        // defining initial values for red, green and blue
        int red_value = 255, green_value = 255, blue_value = 255;
        // defining the iterator variable
        int iterator = 0;
        // looping until the xPos and yPos reach top left
        while (xPos > 0 && yPos > 0) {

            // using black text
            g.setColor(Color.BLACK);
            // filling entire panel
            g.fillRect(0, 0, drawPanel.getWidth(), drawPanel.getHeight());
            // using current r,g,b values to create and use a color
            g.setColor(new Color(red_value, green_value, blue_value));
            // drawing string at specified pos, also displaying r,g,b values
            g.drawString(str + "(R:" + red_value + ",G:" + green_value + ",B:"
                    + blue_value + ")", xPos, yPos);

            // updating x and y coordinates
            xPos--;
            yPos--;
            // based on iterator value, updating red, green or blue value
            if (iterator == 0) {
                red_value -= 5;
                // if red_value goes below 0, resetting it to 255 and advancing
                // iterator
                if (red_value < 0) {
                    red_value = 255;
                    iterator++;
                }
            } else if (iterator == 1) {
                green_value -= 5;
                // if green_value goes below 0, resetting it to 255 and
                // advancing iterator to 2
                if (green_value < 0) {
                    green_value = 255;
                    iterator++;
                }
            } else if (iterator == 2) {
                blue_value -= 5;
                // if blue_value goes below 0, resetting it to 255 and setting
                // iterator to 0
                if (blue_value < 0) {
                    blue_value = 255;
                    iterator = 0;
                }
            }
            // pausing for 50 ms
            drawPanel.sleep(50);
        }

    }
}
