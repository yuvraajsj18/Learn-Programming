/*  
    Write a program to create a multilevel package and also create a reusable class to generate fibonacci series, where the function to generate fibonacci series is given in a different file belonging to same package
*/

package pack16.subpack16;

class Fseries
{
    long fibTerm(final int term)
    {
        if (term == 0 || term == 1)
            return 1;
        return (fibTerm(term - 1) + fibTerm(term - 2));
    }
}