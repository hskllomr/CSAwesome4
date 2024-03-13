public class Rectangle {

    private int length;
    private int width;

    public Rectangle()
    {
        length=10;
        width=10;
        // Add code here
    }

    public Rectangle(int length,int width)
    {
        this.length=length;
        this.width=width;
    }

    // Add two-parameter constructor

    public int getArea()
    {
        return width*length;
    }


    // Add getArea method

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5, 8);
        System.out.println("Rect1 area: " + rect1.getArea()); // Should print "Rect1 area: 100"
        System.out.println("Rect2 area: " + rect2.getArea()); // Should print "Rect2 area: 40"
    }
}