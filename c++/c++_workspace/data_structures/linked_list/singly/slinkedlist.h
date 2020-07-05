#ifdef SLINKED_LIST_H
#define SLINKED_LIST_H


/**
 *  node represents a node in the linked list that contains the data stored at the location 
 *  and a pointer to the next node in the list.
 */
template <typename type>
struct node
{
    type data;
    node* next;
};


template <typename type>
class slist
{
    private:

        node* head;

    public:

        slist();
        ~slist();

};

#endif