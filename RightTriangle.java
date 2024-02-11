import java.awt.*;

public class RightTriangle extends Shape{
    private int base;
    private int height;
    int[] sideA = {getX()-base, getX(), getX()};
    int[] sideB = {getY(), getY(), getY()+height};

    public RightTriangle(int a, int b, int base, int height) {
        super(a, b);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public void draw(Graphics g) {
        g.drawPolygon(sideA, sideB, 3);
    }

    public static void Main(String[] args){

    }
}
