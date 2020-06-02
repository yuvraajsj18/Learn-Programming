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

package practical2.p2;
import practical2.p1.TwoDim;

public class ThreeDim extends TwoDim
{
    private float z;
    public ThreeDim()
    {
        super();
        z = 0;
    }

    public ThreeDim(float x, float y, float z)
    {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString()
    {
        return (super.toString() + ", " + z);
    }
}