import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class Repository extends PropertyChangeSupport {
    private static Repository instance;
    private ArrayList<Component> components;
    private Repository() {
        super(new Object());
        components = new ArrayList<Component>();
    }
    public static Repository getRepository() {
        if (instance == null) {
            instance = new Repository();
        }
        return instance;
    }
    public ArrayList<Component> getComponents() {
        return components;
    }
    public void addABox(Box box) {
        components.add(box);
        firePropertyChange("components",null,box);
    }

}