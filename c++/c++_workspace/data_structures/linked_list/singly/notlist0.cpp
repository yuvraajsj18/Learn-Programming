/**
 *  This code shows why we can't use static variables to create a linked list on stack 
 *  instead of using dymanic memory to create a stack on heap.
 *  the problem is we get only one memory location for our 'static' node and that location 
 *  changes for every node so we end up getting the last value infinite times in our list.
 * 
 *  Our linked list node points to itself. 
 */

#include <iostream>
using namespace std;

struct node
{
    int n;
    node* next;
};

void print_list(node* head);
void prepend(node*& head, int n);
node make_node(int n);

int main()
{
    char choice;
    node* head = nullptr;
    do
    {
        int n;
        cout << "Enter number in list: ";
        cin >> n;
        prepend(head, n);

        cout << "Want to enter more numbers: ";
        cin >> choice;
    } while (choice == 'y' || choice == 'Y');
    
    print_list(head);

    return 0;
}

node make_node(int n)
{
    static node new_node;
    new_node.n = n;
    new_node.next = nullptr;
    return new_node;
}

void prepend(node*& head, int n)
{
    static node new_node;
    new_node = make_node(n);

    new_node.next = head;
    head = &new_node;
}

void print_list(node* head)
{
    node* temp = head;
    while(temp != nullptr)
    {
        cout << temp -> n << flush;
        temp = temp -> next;
    }
}