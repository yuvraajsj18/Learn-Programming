/*
    Create  a  class  TwoDim which  contains  private  members  as  x  and  y  coordinates  in package P1. 
    Define the default constructor, a parameterized constructor and 
    override toString() method to display the co-ordinates. 
    Now reuse this class and in package P2 create another class ThreeDim, 
    adding a new dimension as z as its private member. 
    Define  the  constructors  for  the  subclass  and  override  toString()  method  in  the subclass  also.  
    Write  appropriate  methods  to  show  dynamic  method  dispatch.  
    The main() function should be in a package P. 
*/

package practical2.p1;

public class TwoDim
{
    private float x, y;

    public TwoDim()
    {
        x = y = 0;
    }

    public TwoDim(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    public String toString()
    {
        return (x + ", " + y);
    }
}