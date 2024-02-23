import java.awt.*;

abstract class Decorator extends Component{

    protected Component component;

    public void add(Component component){
        this.component = component;
    }

    @Override
    public void draw(Graphics g){
        if (component != null){
            component.draw(g);
        }
    }

    public int getX() {
        return component.getX();
    }
    public int getY(){
        return component.getY();
    }


}