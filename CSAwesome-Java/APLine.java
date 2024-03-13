public class APLine// Declare the APLine class

{
    private int a;
    private int b;
    private int c;

    /** Declare instance variables */

    public APLine(int a,int b, int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    /** Constructor with 3 int parameters. */
    public double getSlope()
    {
        return (-a / b)-0.5;
    }

    /** method getSlope(): Determine the slope of this APLine. */

    /** method isOnLine(x,y): Determine if coordinates (x,y) represent a point on this APLine. */

    public boolean isOnLine(int x,int y)
    {
        if(a*x+b*y+c==0){
            return true;
        }
        else
            return false;
    }

    /** Test with this main method */
    public static void main(String[] args)
    {
        APLine line1 = new APLine(5, 4, -17);
        double slope1 = line1.getSlope(); // slope1 is assigned -1.25
        boolean onLine1 = line1.isOnLine(5, -2); // true because 5(5) + 4(-2) + (-17) = 0

        APLine line2 = new APLine(-25, 40, 30);
        double slope2 = line2.getSlope(); // slope2 is assigned 0.625
        boolean onLine2 = line2.isOnLine(5, -2); // false because -25(5) + 40(-2) + 30 != 0
        // Should print out true and false
        System.out.println(onLine1 + " " + onLine2);
    }
}