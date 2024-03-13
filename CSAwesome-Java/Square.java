public class Square
{
    private int length;
    private static int numberOfSquares=0;

    // Your code here: define variables //
    // hint: numberOfSquares should be static & initialized //

    public Square(int length,int numberOfSquares)
    {
        this.length = length;
        this.numberOfSquares++;
    }

    public int getArea()
    {
        return this.length*this.length;
        // Your code here //
    }

    public String toString()
    {
        // Your code here //
        return "Length: "+length;
    }

    public static void main(String[] args)
    {
        Square.numberOfSquares = 0; // this is only set for evaluation
        Square s1 = new Square(5,5);
        System.out.println(
                "Square 1 area: "
                        + s1.getArea()); // Should print "Square 1 area: 25"
        Square s2 = new Square(6,6);
        System.out.println(
                "Square 2 area: "
                        + s2.getArea()); // Should print "Square 2 area: 36"
        System.out.println(s1); // Should print "Length: 5"
        System.out.println(s2); // Should print "Length: 6"
        System.out.println("Number of squares: "+ Square.numberOfSquares); // Should print "Number of
        // squares: 2"
    }
}
