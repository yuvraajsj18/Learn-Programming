/*
Write a Program to accept the truth values of variables x and y, 
and print the truth table of the following logical operations:
a) Conjunction 
f) Exclusive NOR
b) Disjunction
g) Negation
c) Exclusive OR
h) NAND
d) Conditional 
i) NOR
e) Bi-conditional
*/

#include <iostream>
#include <cctype>
using namespace std;

string toLower(string s);
bool setTruthValue(string str);

int main()
{
    string xStr, yStr;
    do
    {
        cout << "Enter truth value of x: ";
        getline(cin, xStr);
    } while (xStr.length() == 0);

    do
    {
        cout << "Enter truth value of y: ";
        getline(cin , yStr);
    } while (yStr.length() == 0);
    
    bool x = setTruthValue(xStr);
    bool y = setTruthValue(yStr);

    cout << boolalpha << x << " conjuction(&) " << y << " is " << (x && y) << endl; 
    cout << boolalpha << x << " XOR(^) " << y << " is " << ((x && (!y)) || ((!x && y))) << endl; 
    cout << boolalpha << x << " disjunction(|) " << y << " is " << (x || y) << endl;
    cout << boolalpha << "Negation(~) of " << x << " is " << (!x) << endl; 
    cout << boolalpha <<  "Negation(~) of " << y << " is " << (!y) << endl;
    cout << boolalpha << x << " XNOR " << y << " is " << (!(x ^ y)) << endl;     
    cout << boolalpha << x << " NAND " << y << " is " << (!(x && y)) << endl;
    cout << boolalpha << x << " NOR " << y << " is " << (!(x || y)) << endl;
    cout << boolalpha << x << " conditional(implies -->) " << y << " is " << ((!x) || y) << endl;
    cout << boolalpha << x << " biconditional(iff <-->) " << y << " is " << (!(x ^ y)) << endl;

    return 0;
}

string toLower(string s)
{
    for (int i = 0; i < s.length(); i++)
    {
        s[i] = tolower(s[i]);
    }
    return s;
}

bool setTruthValue(string str)
{
    str = toLower(str);
    if (str == "t" || str == "true")
        return true;
    else if (str == "f" || str == "false")
        return false;
    else
    {
        cout << "Invalid Truth Value" << endl;
        exit(1);
    }
}