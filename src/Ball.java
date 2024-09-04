public class Ball {

    int x;
    int y;
    int radius;

    public Ball (int x, int y, int radius) {

        if (radius < 0) {
            throw new IllegalArgumentException("반지름은 음수가 될 수 없습니다.");
        }
        
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public int getMinX() {
        return getX() - getRadius();
    }

    public int getMaxX() {
        return getX() + getRadius();
    }

    public int getMinY() {
        return getY() - getRadius();
    }

    public int getMaxY() {
        return getY() + getRadius();
    }

    public int getWidth() {
        return getRadius() * 2;
    }

    public int getHeight() {
        return getRadius() * 2;
    }

    @Override
    public String toString() {
        return String.format("[(%d,%d),%d]", x, y, radius);
    }

    public static void main(String[] args) throws Exception {
    }
}
