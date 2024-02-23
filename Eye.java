import java.awt.*;
import java.util.ArrayList;

public class Eye extends Decorator {

    Eye() {
    }

    public void draw(Graphics g) {
        super.draw(g);
        g.setColor(Color.WHITE);
        g.fillOval(super.getX()+2, super.getY()+2, 8, 8);
        g.setColor(Color.BLACK);
        g.fillOval(super.getX()+2, super.getY()+2, 4, 4);
    }

}

