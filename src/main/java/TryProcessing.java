import processing.core.PApplet;

public class TryProcessing extends PApplet {


    public static final int WIDTH = 640;
    public static final int HEIGHT = 640;
    public static final int DIAMETER =50;
    int x=0;
    int y=0;
    int u=0;
    int v=0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);}

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }


    @Override
    public void draw() {
       paintwhite();
        ellipse(x,WIDTH/5,DIAMETER, DIAMETER);
        x++;
        ellipse(y,2*WIDTH/5,DIAMETER,DIAMETER);
        y=y+2;
        ellipse(u,3*WIDTH/5,DIAMETER,DIAMETER);
        u=u+3;
        ellipse(v,4*WIDTH/5,DIAMETER,DIAMETER);
        v=v+4;

    }
    private void paintwhite(){
        background(255);

    }

}
