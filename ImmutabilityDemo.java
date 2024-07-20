final class Circle {
    private final Point p;
    private final int radius;

    public Circle(Point p, int radius) {
        this.p = p;
        this.radius = radius;
    }

    public Circle moveTo(int x, int y) {
        return new Circle(p.moveTo(x, y), radius);
    }

    @Override
    public String toString() {
        return "Point: " + p.toString() + "Radius: " + this.radius;
    }
}
final class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point moveTo(int x, int y) {
        return new Point(x, y);
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}

class MutableCircle {
    private MutablePoint p;
    private int radius;

    public MutableCircle(MutablePoint p, int radius) {
        this.p = p;
        this.radius = radius;
    }

    public MutableCircle moveTo(int x, int y) {
        return new MutableCircle(p.moveTo(x, y), radius);
    }

    @Override
    public String toString() {
        return "Point: " + p.toString() + "Radius: " + this.radius;
    }
}

class MutablePoint {
    private int x;
    private int y;

    public MutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MutablePoint moveTo(int x, int y) {
        this.x = x;
        this.y = y;
        return this;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}

public class ImmutabilityDemo {
    public static void main(String[] args) {
        // immutable
        System.out.println("immutable");
        Point p = new Point(2, 2);
        Circle c1 = new Circle(p, 5);
        Circle c2 = new Circle(p, 10);
        System.out.println(c1.moveTo(10, 10));
        System.out.println(c1);
        p.moveTo(20, 20);
        System.out.println(c2);
        /* mutable */
        System.out.println("mutable");
        MutablePoint mp = new MutablePoint(20, 20);
        MutableCircle c3 = new MutableCircle(mp, 50);
        MutableCircle c4 = new MutableCircle(mp, 100);
        mp.moveTo(5, 5);
        System.out.println(c3);
        System.out.println(c4);
    }
}
