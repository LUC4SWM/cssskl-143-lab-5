import java.awt.*;

public class Circle extends Shape{

    private int radius;

    public Circle(int a, int b, int radius) {
        super(a, b);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw(Graphics g) {
        g.drawOval(getX(), getY(), 2*radius, 2*radius);
    }


}
