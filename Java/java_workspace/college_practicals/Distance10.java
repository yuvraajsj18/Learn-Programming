// create distance class, distance is computed in terms of feet and inches, create object and use this podoubleer

class Distance
{
    double feet;
    double inches;

    Distance(double feet, double inches)
    {
        this.feet = feet;
        while (inches > 12)
        {
            this.feet++;
            inches = inches % 12;
        }
        this.inches = inches;
    }

    Distance(Distance obj)
    {
        this.feet = obj.feet;
        this.inches = obj.inches;
    }

    void print()
    {
        System.out.println("Distance is " + feet + " feets and " + inches + " inches.");
    }
}

class Distance10
{
    public static void main(String args[])
    {
        Distance obj = new Distance(5, 13);
        obj.print();

        Distance objRef = obj;
        objRef.feet = 7;
        objRef.print();
        obj.inches = 10;
        obj.print();
        
        Distance clone = new Distance(obj); 
        clone.print();
    }
}