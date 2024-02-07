public class ColorWithAlpha extends SimpleColor{
    private int alpha; // between 0-255

    public int getAlpha() {
        return alpha;
    }
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    public ColorWithAlpha(int alpha){
        super(0,0,0);
        this.alpha = alpha;
    }
    public ColorWithAlpha(int r, int g, int b, int alpha){
        super(r,g,b);
        this.alpha = alpha;
    }
    public ColorWithAlpha(ColorWithAlpha c){
        super(c.getR(), c.getG(),c.getB());
        this.alpha = c.getAlpha();
    }

    @Override
    public String toString() {
        return super.toString() + ", alpha: " + alpha;
    }

    @Override
    public boolean equals(ColorWithAlpha obj) {
        if (obj != null && obj.getClass() == getClass()){
            return super.equals(obj) && alpha == ((ColorWithAlpha) )
        }
        return false;
    }
}
