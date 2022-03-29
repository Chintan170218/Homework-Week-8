package homeworkw8;

public class Point16 {


    int x, y;

    public Point16() {

    }

    public Point16(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        x = this.x;
    }

    public void setY(int y) {
        this.y = y;
    }
    //distance one point to (0,0)
    public double distance() {

        return distance(0, 0);
    }
    //distance with two parameter
    public double distance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }
    //distance to another point
    public double distance(Point16 point) {
        return distance(point.x, point.y);
    }

    public static void main(String[] args) {
        Point16 first = new Point16(6, 5);
        Point16 second = new Point16(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point16 point = new Point16();
        System.out.println("distance()= " + point.distance());
    }

}
