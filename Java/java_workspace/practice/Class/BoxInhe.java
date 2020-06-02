class Box
{
    double depth;
    private double height;
    double width;

    Box (Box obj)
    {
        depth = obj.depth;
        height = obj.height;
        width = obj.width;
    }
    Box (double depth, double height, double width)
    {
        this.depth = depth;
        this.width = width;
        this.height = height;
    }
    Box()
    {
        depth = -1;
        height = -1;
        width = -1;
    }
    double volume()
    {
        return depth * height * width;
    }
    void printBW()
    {
        System.out.println("Box");
    }
}

class BoxWeight extends Box
{
    double weight;
    BoxWeight(double d, double h, double w, double m)
    {
        super(d,h,w);
        weight = m;
        // depth = d;
        // width = w;
        // height = h;
    }
    void printBW()
    {
        System.out.println("BoxWeight");
    }
}

class BoxInhe
{
    public static void main(String args[])
    {
        BoxWeight objBW = new BoxWeight(1, 2, 3, 4);
        objBW.weight = 10;
        System.out.println(objBW.volume());    

        Box objB = new BoxWeight(1, 2, 3, 4);
        // objB.weight = 10;    // weight not known to Box
        objB.depth = 5;
        System.out.println(objB.volume());
        objB.printBW(); // access from Box accessed of BW
    }
}