import java.beans.PropertyChangeSupport;
import java.awt.Point;
import java.util.Random;

class CircleBuilder extends PropertyChangeSupport implements Runnable {
    private int x, y;

    public CircleBuilder() {
        super(new Object());
    }

    public void run() {
        while (true) {
            x += 10;
            y += 10;
            if (x > 800) x = 0; // Reset x if it goes beyond screen width
            if (y > 600) y = 0; // Reset y if it goes beyond screen height
            Repository.getInstance().addCircle(new Point(x, y));
            try {
                Thread.sleep(1000); // Increment position every second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}