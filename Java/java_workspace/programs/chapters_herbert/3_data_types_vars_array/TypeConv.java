// show convertion of compatible type in java

class TypeConv
{
    public static void main(String args[])
    {
        byte b = 2;
        int iFromB = b;
        System.out.println(iFromB);
        // float f = 2.35f;    // 2.35 is double wont work
        // int iFromF = f;     // no automatic conversion
        // System.out.println(iFromF);
        int i = 5;
        float fFromI = i;
        System.out.println(fFromI);
        // double d = 3.12345;  
        // float fFromD = d;    // no automatic conversion
        // System.out.println(fFromD);
        long l = 1111111111111111111l;  // 1111111111111111111 wont work as int can not store such a large number
        System.out.println(l);
        // b = 128;     no auto conv if out of range dest range
        // System.out.println(b);
        // b = b * 10;  // possivble lossy conversion
        System.out.println(b);
    }
}