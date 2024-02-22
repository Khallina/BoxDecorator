import javax.swing.*;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

public class Main extends JFrame {
    Screen screen;
    public Main() {
        setTitle("Hello World");
        setLocation(100,100);
        screen = new Screen();
        add(screen);
        Repository.getRepository().addPropertyChangeListener(screen);
        Thread t = new Thread(new BoxGenerator());
        t.start();
    }
    public static void main(String [] args) {
        Main main = new Main();
        main.setVisible(true);
        main.setSize(300,200);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
import java.awt.*;
public class Box {
    private int x, y, width, height;
    private Color color;

    Box(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}