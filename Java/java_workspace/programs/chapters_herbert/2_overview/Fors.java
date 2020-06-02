// uses for loop in java

class Fors
{
    public static void main(String args[])  // int main doesnt work
    {
        for (int x = 0; x < 10; x = x + 1)  // x++ works x+=1 works
            System.out.println("x : " + x);
        // System.out.println("x : " + x); out of scope x
    }
}