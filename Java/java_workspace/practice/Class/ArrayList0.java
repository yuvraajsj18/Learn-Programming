package Class;

import java.util.ArrayList;

class ArrayList0
{
    public static void main(String args[])
    {
        ArrayList arrList = new ArrayList();
        arrList.add(1);
        arrList.add("Hello");
        for (int i = 65; i < 70; i++)
        {
            arrList.add(i);
            arrList.add((char)i);
        }
        for (Object obj : arrList)
        {
            System.out.println(obj);
        }
        System.out.println(arrList.get(3));
    }
}