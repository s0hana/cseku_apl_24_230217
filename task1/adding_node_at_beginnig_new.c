#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *link; // Link to the next node
};

typedef struct node strn; // Creates an alias 'strn' for 'struct node' to simplify variable declarations

int main(void)
{
    strn *start, *temp, *current;
    int count = 1;

    // Create a linked list with 10 nodes
    while(count <= 10)
    {
        strn *temp_node;
        temp_node = (strn *)malloc(sizeof(strn)); // Allocates memory for a node of type 'strn'
        temp_node->data = count;
        temp_node->link = NULL; // Set the link to NULL (end of the list)

        if(count == 1)
        {
            start = temp_node;  // Initialize start with the first node
            current = temp_node; // Initialize current node
        }
        else
        {
            current->link = temp_node; // Link the previous node to the new node
            current = temp_node;       // Update current to the new node
        }
        count++;
    }



    // Display the list before adding a new node
    temp = start; // Assigns the pointer 'start' to 'temp'
    printf("Before adding a node: ");
    while(temp != NULL)
    {
        printf("%d ", temp->data);
        temp = temp->link;
    }



    // Creation and addition of a new node at the start of the list
    strn *newnode = (strn *)malloc(sizeof(strn)); // Allocates memory for a node of type 'strn'
    newnode->data = 0; // Set the data of the new node to 0
    newnode->link = start; // The new node's link points to the current start node
    start = newnode; // Updates 'start' to point to the new node, making it the new head



    // Display the list after adding the new node
    temp = start; // Reassign 'temp' to start for traversal
    printf("\nAfter adding a node: ");
    while(temp != NULL)
    {
        printf("%d ", temp->data);
        temp = temp->link;
    }


    return 0;
}
