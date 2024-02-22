import javax.swing.*;

public class Main extends JFrame {
    Screen screen;
    public Main() {
        setTitle("Hello World");
        setLocation(100,100);
        screen = new Screen();
        add(screen);
        Repository.getRepository().addPropertyChangeListener(screen);
        Thread t = new Thread(new BoxBuilder());
        t.start();
    }
    public static void main(String [] args) {
        Main main = new Main();
        main.setVisible(true);
        main.setSize(300,200);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}