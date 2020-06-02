

class Test
{
    public static void main(String args[])
    {
        int i = 0, j = 9;
        do
        {
            i++;
            if (j-- < i++)
            {
                break;
            }
        } while (i < 5);
        System.out.println(i + "" + j);
    }
}

// class Main
// {
//     public static void main(String args[])
//     {
//         short s = 0;
//         int x = 07;
//         // int y = 08; /// error out of range octal
//         int z = 112345;

//         s += z;

//         int largeInt = 40_000;
//         // short intToShort = largeInt;    // can not convert
//         short intToShort = 0;
//         intToShort += largeInt; // short hand operator do casting if required by itself type += (type) (incompType)
//         // intToShort = intToShort + largeInt;  wont work
//         System.out.println(intToShort);
//         // System.out.println("" + x + y + s);
//         System.out.println("" + x + s);
//         System.out.println("" + 1 + 2);
//         System.out.println(("" + 1) + 2);
//         System.out.println("" + (1 + 2));
//     }
// }

// class Test
// {
//     public static void main(String args[])
//     {
//         for (int i = 0; 1; i++) // incmpatible type int can not be converted to boolean
//         {
//             System.out.println("Hello");
//             break;
//         }
//     }
// }

// class Output
// {
//     public static void main(String args[])
//     {
//         Output o = new Output();
//         o.go();
//     }
//     void go()
//     {
//         int y = 7;
//         for (int x = 1; x < 8; x++)
//         {
//             y++;
//             if (x > 4)
//             {
//                 System.out.print(++y + " ");
//             }
//             if (y > 14)
//             {
//                 System.out.println("x = " + x);
//                 break;
//             }
//         }
//     }
// }