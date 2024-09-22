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
    strn *start, *n, *current, *p;
    int c=0;

    while(1)
    {
        n = (strn *)malloc(sizeof(strn));
        n->data  = c;
        n->link = null;
        if(c==0)
        {
            start = n;
            current =n;
        }
        else
        {
            current->link = n;
            current = n;
        }
        c++;
        if(c==31){break;}
    }
    p = start;
    printf("The linked list:");
    while(p!=null)
    {
        printf("%d ", p->data);
        p = p->link;
    }

}
