abstract class Decorator extends Component{

    protected Component component;

    public void setComponent(Component component){
        this.component = component;
    }

    @Override
    public void draw(){
        if (component != null){
            component.draw();
        }
    }
}