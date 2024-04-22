import processing.core.PApplet;

public class Circle {
    int x, y, speed;
    PApplet sketch;

    public Circle(PApplet sketch, int yPosition, int speed) {
        this.sketch = sketch;
        this.x = 0;
        this.y = yPosition;
        this.speed = speed;
    }

    public void draw() {
        sketch.ellipse(x, y, TryProcessing.DIAMETER, TryProcessing.DIAMETER);
        x += speed;
    }
}
