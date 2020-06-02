#include <iostream>
using namespace std;

string strItr(string str);
string strRev(string str);
void strRev(string& str, int start, int length);
string strRev1(string str);

int main()
{
    string str;
    cout << "String: ";
    getline(cin, str);
    string newStr = strItr(str);
    cout << "Reverse of String is " << newStr << endl;

    newStr = strRev(str);
    cout << "Reverse of String is " << newStr << endl;

    newStr = strRev1(str);
    cout << "Reverse of String is " << newStr << endl;

    return 0;
}

string strRev1(string str)
{
    if (str.length() == 0 || str.length() == 1)
        return str;

    return strRev1(str.substr(1, str.length() - 1)) + str.substr(0, 1);
}

string strRev(string str)
{
    strRev(str, 0, str.length());

    return str;
}

void strRev(string& str, int start, int end)
{
    int length = end - start;
    if ((length == 0 || length == 1) || start > str.length() / 2)
        return;

    if (str[start] != str[end - 1])
    {
        char temp = str[start];
        str[start] = str[end - 1];
        str[end - 1] = temp;
    }
    strRev(str, start + 1, end - 1);
}

string strItr(string str)
{
    const int strLen = str.length() - 1;
    const int strLenHalf = strLen / 2;
    for (int i = 0; i <= strLenHalf; i++)
    {
        if (str[i] != str[strLen - i])
        {
            char temp = str[i];
            str[i] = str[strLen - i];
            str[strLen - i] = temp;
        }
    }

    return str;
}