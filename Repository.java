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
    public void addABox(Component component) {
        components.add(component);
        firePropertyChange("component",null, component);
    }

}