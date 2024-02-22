import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public class Screen extends JPanel implements PropertyChangeListener {

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        ArrayList<Component> shapes = new ArrayList<Component>();
        shapes = Repository.getRepository().getComponents();
        for(Component shape : shapes) {
            shape.draw();
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        repaint();
    }
}