// 5. convert decimal into binary number
import java.util.Scanner;
// import java.lang.Math;   // not neccessary

public class DecToBin
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decNum = sc.nextInt();

        if (decNum == 0 || decNum == 1)
            System.out.println("Binary of " + decNum + " is " + decNum);
        else
        {
            int numBits = (int) Math.ceil(Math.log(decNum) / Math.log (2));     // saving space by calculating number of bits required
            int binNum[] = new int[numBits];

            // convert into binary
            int tempDec = decNum;
            int i = 0;
            while(tempDec != 0)
            {
                int digit = tempDec % 2;
                binNum[i++] = digit;
                tempDec /= 2;
            }

            System.out.print("Binary of " + decNum + " is ");
            for (int j = --i; j >= 0; j--)
                System.out.print(binNum[j]);
            System.out.println();
        }
        sc.close();
    }
}