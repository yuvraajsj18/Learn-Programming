#include <iostream>
#include <cstdlib>
#include <cstring>

int bigSum(std :: string bigNum, std :: string smallNum, int result[]);
int stringToNumArr(std :: string numStr, int numArr[]);

int main()
{   
    std :: string num1, num2;
    std :: cout << "Enter first number: ";
    getline(std :: cin, num1);
    std :: cout << "Enter second number: ";
    getline(std :: cin, num2);

    int num3[200];
    int num3_size;
    if (num1.length() > num2.length())
        num3_size = bigSum(num1, num2, num3);
    else
        num3_size = bigSum(num2, num1, num3);

    for (int i = num3_size - 1; i >=0 ; i--)
    {
        std :: cout << num3[i];
    }    

    std :: cout << std :: endl;

    return 0;
}

int bigSum(std :: string bigNum, std :: string smallNum, int result[])
{
    int digit_bigNum[100];
    int bigSize = stringToNumArr(bigNum, digit_bigNum);
    int digit_smallNum[100];
    int smallSize = stringToNumArr(smallNum, digit_smallNum);
    
    int carry = 0;
    int sizeRes = 0;
    for (int i = bigSize - 1, j = smallSize - 1; i >= 0; i--, sizeRes++)
    {
        int tempRes;
        if (j >= 0)
        {
            tempRes = digit_bigNum[i] + digit_smallNum[j--] + carry;
        }
        else
        {
            tempRes = digit_bigNum[i] + carry;
        }
        result[sizeRes] = tempRes % 10;
        carry = tempRes / 10;
    }
    if (carry != 0)
        result[sizeRes] = carry;

    return sizeRes;
}

int stringToNumArr(std :: string numStr, int numArr[])
{
    int size_arr = numStr.length(); 
    for (int i = 0; i < size_arr; i++)
        numArr[i] = numStr[i] - '0';
    
    return size_arr;
}