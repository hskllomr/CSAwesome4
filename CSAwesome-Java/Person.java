public class Person {
    // define a String instance variable "name"

    private String name;

    // define a int instance variable called "age"

    private int age;

    // create a constructor that takes name and age (in that order) and initializes the instance variables

    public Person(String name1,int age1)
    {
        name=name1;
        age=age1;
    }

    public String getName()
    {
        return name;
    }

    // create a getName method

    public void setName(String name2)
    {
        name=name2;
    }

    // create a setName method

    public String toString()
    {
        return name+" is "+age+" years old ";
    }

    // create a toString method that should return "{name} is {age} years old"
    // see the main method for an example

    public static void main(String[] args) {
        Person p = new Person("Joe", 2);

        System.out.println("p's name: " + p.getName()); // Should print "p's name: Joe"

        p.setName("Joseph"); // Changing name to Joseph

        System.out.println("p's new name: " + p.getName()); // Should print "p's new name: Joseph"

        System.out.println(p); // Should print "Joseph is 35 years old"
    }
}
