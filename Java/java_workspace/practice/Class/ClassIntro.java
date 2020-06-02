class Box   // default by default
{
    double width;   // default by default
    double height;
    double depth;

    Box(double width, double height, double depth)
    {
        this.width++;   // 0++ 
        this.width += width;
        this.height = height;
        this.depth = depth;
    }

    void volume()   // default by default
    {
        System.out.println(width * height * depth);
    }
}

class BoxDemo
{
    public static void main(String args[])
    {
        Box myBox1;     // a reference variable to an object of type Box
        myBox1 = new Box(1,2,3);     // allocating real memory to refer to from myBox1
        Box myBox2 = new Box(4,5,6); // can be done together
        myBox1.volume();
        System.out.println(myBox1.width);   // will be zero set by default constructor
        myBox1.width = 50;
        myBox2.width = 51;
        System.out.println(myBox1.width);
        System.out.println(myBox2.width);
        myBox2 = myBox1; // now myBox2 refers to same location as myBox1 and the location where myBox2 refered is lost
        System.out.println(myBox2.width);
        myBox2 = null;  // now refer to nowhere
        // System.out.println(myBox2.width);    // error

        // printing the value of reference var and where the refer
        System.out.println();
        System.out.println("myBox1: " + myBox1);    // address of the refered location
    }
}