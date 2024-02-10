// TODO If you use this class because you dont have your
// previous SimpleColor, you must document the code with comments
// and fix the setters so they don't invalidate the [0-255] rule.
public abstract class SimpleColor {
    private int r;
    private int g;
    private int b;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        if((r < 0) || (r > 255)){
            throw new ColorException();
        } else {
            this.r = r;
        }
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        if((g < 0) || (g > 255)){
            throw new ColorException();
        } else {
            this.g = g;
        }
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        if((b < 0) || (b > 255)){
            throw new ColorException();
        } else {
            this.b = b;
        }
    }

    public void setColor(int a, int b, int c) {
        setR(a);
        setG(b);
        setB(c);
    }

    public SimpleColor() {
    }

    public SimpleColor(int r, int g, int b) {
        setR(r);
        setG(g);
        setB(b);
    }

    public SimpleColor(SimpleColor other) {
        this(other.r, other.g, other.b);
    }

    public String toString() {
        return "RGB: (" + getR() + ", " + getG() + ", " + getB() + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()){
            return r == ((SimpleColor) obj).getR() && g == ((SimpleColor) obj).getG() && b == ((SimpleColor) obj).getB();
        }

        return false;
    }


}
