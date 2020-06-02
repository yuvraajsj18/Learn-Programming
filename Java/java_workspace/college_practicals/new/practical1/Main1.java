/*
    Design  a  class  Complex  having  a  real  part  (x)  and  an  imaginary  part  (y).
    Provide methods to perform the following on complex numbers: 
    a)Add two complex numbers.
    b)Multiply two complex numbers.
    c)toString() method to display complex numbers in the form: x + i y
*/

package practical1;
import java.util.Scanner;

class Complex
{
    private float x;
    private float y;
    
    Complex(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    Complex()
    {
        x = y = 0;
    }

    void input(Scanner sc)
    {
        System.out.println("Real Part: ");
        x = sc.nextFloat();
        System.out.println("Imaginary Part: ");
        y = sc.nextFloat();
    }

    @Override
    public String toString()
    {
        return ("(" + x + " + i " + y + ")");
    }

    Complex add(Complex num)
    {
        Complex result = new Complex();
        result.x = this.x + num.x;
        result.y = this.y + num.y;
        return result;
    }   

    Complex multiply(Complex num)
    {
        // (a+bi)(c+di) = (ac−bd) + (ad+bc)i
        Complex result = new Complex();
        result.x = (this.x * num.x) - (this.y * num.y);
        result.y = (this.x * num.y) + (this.y * num.x);
        return result;
    }
}

public class Main1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Complex c1 = new Complex();
        System.out.println("Enter first complex number c1 : ");
        c1.input(sc);
        Complex c2 = new Complex();
        System.out.println("Enter second complex number c2 : ");
        c2.input(sc);

        Complex add = c1.add(c2);
        System.out.println(c1.toString() + " + " + c2.toString() + " = " + add.toString());

        Complex multiply = c1.multiply(c2);
        System.out.println(c1.toString() + " x " + c2.toString() + " = " + multiply.toString());

        sc.close();
    }
}