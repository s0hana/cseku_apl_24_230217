#include<stdio.h>
#include<stdlib.h>
#define null 0
struct node
{
    int data;
    struct node *link;
};
typedef struct node strn;
int main(void)
{
    strn *start, *n, *p, *current;
    int count = 1;
    while(count<=10)
    {
        n = (strn *)malloc(sizeof(strn));
        n->data = count;
        n->link = null;
        if(count == 1)
        {
            start = n;
            current = n;
        }
        else
        {
            current->link = n;
            current = n;
        }
        count++;
    }
    p = start;
    printf("Before adding a node: ");
    while(p!=null)
    {
        printf("%d ", p->data);
        p= p->link;
    }
    strn *newnode = (strn *)malloc(sizeof(strn));
    newnode->data = 0;
    newnode->link = null;
    newnode->link = start;
    start = newnode;
    strn *m = start;
    printf("\nAfter adding a node: ");
    while(m!=null)
    {
        printf("%d ", m->data);
        m= m->link;
    }


}
