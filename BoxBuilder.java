import java.awt.*;
import java.beans.PropertyChangeSupport;
public class BoxBuilder implements Runnable {
    public void run() {
        while (true) {
            int x = (int) (Math.random() * 300);
            int y = (int) (Math.random() * 200);
            int width = (int) (Math.random()*50);
            int height = (int) (Math.random()*50);
            int red = (int) (Math.random()*255);
            int green = (int) (Math.random()*255);
            int blue = (int) (Math.random()*255);
            Box box = new Box(x,y,width,height,new Color(red,green,blue));
            Eye eye = new Eye();
            eye.add(box);
            Repository.getRepository().addABox(eye);
         //   Repository.getRepository().addABox(box);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}