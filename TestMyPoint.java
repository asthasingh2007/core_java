class MyPoint {
    private int x;
    private int y;

    // Default constructor
    MyPoint() {
        x = 0;
        y = 0;
    }

    // Parameterized constructor
    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Set method
    void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Get method
    int[] getXY() {
        return new int[]{x, y};
    }

    // toString method
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Distance from given x and y
    double distance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x)
                       + (this.y - y) * (this.y - y));
    }

    // Distance from another MyPoint object
    double distance(MyPoint another) {
        return Math.sqrt((this.x - another.x) * (this.x - another.x)
                       + (this.y - another.y) * (this.y - another.y));
    }

    // Distance from origin (0,0)
    double distance() {
        return Math.sqrt(x * x + y * y);
    }
}

public class TestMyPoint {
    public static void main(String[] args) {

        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(3, 4);

        System.out.println("Point p1: " + p1);
        System.out.println("Point p2: " + p2);

        p1.setXY(1, 2);
        int[] xy = p1.getXY();
        System.out.println("After setXY, p1: (" + xy[0] + ", " + xy[1] + ")");

        System.out.println("Distance from p1 to (0,0): " + p1.distance());
        System.out.println("Distance from p1 to (3,4): " + p1.distance(3, 4));
        System.out.println("Distance from p1 to p2: " + p1.distance(p2));
    }
}

