import java.awt.*;

public class Eye extends Decorator {
    private int x, y;

    Eye(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void draw(Graphics g) {
        super.draw();
        g.setColor(Color.WHITE);
        g.fillOval(x, y, 8, 8);
        g.setColor(Color.BLACK);
        g.fillOval(x, y, 4, 4);
    }
}
}
