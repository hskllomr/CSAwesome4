public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {

        this.x=x;
        this.y=y;
        // YOUR CODE HERE
    }

    public double getDistance(Point other)
    {
        return Math.sqrt(Math.pow((this.x-other.x),2)+(Math.pow((this.y-other.y),2)));
        // YOUR CODE HERE
        // HINT: Use Math.pow and Math.sqrt (from your reference sheet)
    }

    public int getX()
    {
        return x;
        // YOUR CODE HERE
    }

    public int getY()
    {
        return y;
        // YOUR CODE HERE
    }

    public String toString()
    {
        return "("+x+", "+y+")";
        // YOUR CODE HERE
    }

    public static void main(String[] args) {
        Point origin = new Point(0, 0);
        Point C = new Point(3, 4);
        System.out.println("The origin is at " + origin); // Should print "The origin is at (0, 0)"
        System.out.println("That is " + origin.getDistance(C) + " units away from " + C); // Should print "That is 5.0 units away from (3, 4)"
        Point D = new Point(5, 6);
        System.out.println("And " + Math.round(origin.getDistance(D) * 100) / 100.0 + " units away from " + D); // Should print "And 7.81 units away from (5, 6)"
        System.out.println(C + " and " + D + " are " + Math.round(C.getDistance(D) * 100) / 100.0 + " units away from each other"); // Should print "(3, 4) and (5, 6) are 2.83 units away from each other"
    }
}
