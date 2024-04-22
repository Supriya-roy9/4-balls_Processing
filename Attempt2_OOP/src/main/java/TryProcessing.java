import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 640;
    public static final int DIAMETER = 50;
    Circle[] circles;

    public static void main(String[] args) {
        PApplet.main("TryProcessing");
    }

    public void settings() {
        size(WIDTH, HEIGHT);
    }

    public void setup() {
        circles = new Circle[4];
        circles[0] = new Circle(this, WIDTH / 5, 1);
        circles[1] = new Circle(this, 2 * WIDTH / 5, 2);
        circles[2] = new Circle(this, 3 * WIDTH / 5, 3);
        circles[3] = new Circle(this, 4 * WIDTH / 5, 4);
    }

    public void draw() {
        background(255);
        for (Circle circle : circles) {
            circle.draw();
        }
    }
}



