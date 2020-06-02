/*
    Create an exception subclass UnderAge, which prints “Under Age” along with the age value 
    when an object of UnderAge class is printed in the catch statement. 
    Write a class exceptionDemo in which the method test() throws UnderAge exception 
    if the variable age  passed  to  it  as  argument  is  less  than  18.  
    Write  main()  method  also  to  show working of the program. 
*/
package practical4;

class UnderAge extends Exception
{
    UnderAge(int age)
    {
        super(Integer.toString(age));
    }
    public String toString()
    {
        return ("Under Age: " + super.getMessage());
    }
}

class ExceptionDemo
{
    void test(int age) throws UnderAge
    {
        if (age < 18)
            throw new UnderAge(age);
        else
            System.out.println("Valid age");
    }
}

class Main4
{
    public static void main(String[] args) {
        ExceptionDemo obj = new ExceptionDemo();
        try
        {
            obj.test(20);
            obj.test(10);
        }
        catch(UnderAge eAge)
        {
            System.out.println(eAge);
        }
    }
}