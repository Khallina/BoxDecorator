import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class Repository extends PropertyChangeSupport {
    private static Repository instance;
    private ArrayList<Box> boxes;
    private Repository() {
        super(new Object());
        boxes = new ArrayList<Box>();
    }
    public static Repository getRepository() {
        if (instance == null) {
            instance = new Repository();
        }
        return instance;
    }
    public ArrayList<Box> getBoxes() {
        return boxes;
    }
    public void addABox(Box box) {
        boxes.add(box);
        firePropertyChange("boxes",null,box);
    }

}