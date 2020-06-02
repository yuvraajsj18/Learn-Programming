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

package practical2.p;

import practical2.p1.TwoDim;
import practical2.p2.ThreeDim;

public class Main2
{
    public static void main(String[] args) {
        TwoDim twoD = new TwoDim(2, 3);
        ThreeDim threeD = new ThreeDim(4, 5, 6);

        printDiscription(twoD);
        printDiscription(threeD);
    }

    // shows dynamic method dispatch
    static void printDiscription(TwoDim obj)
    {
        System.out.println(obj.toString());
    }
}