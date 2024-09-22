#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node *next;
};


// Typedef to simplify the struct definition, allowing us to use 'Node' instead of 'struct Node'
typedef struct Node Node;


Node *createNode(int value);
void appendNode(Node **start, int value);
void displayList(Node *start);
void prependNode(Node **start, int value);

int main(void)
{
    Node *start = NULL;
    int count;

    // Creates a linked list with values from 1 to 10
    for (count = 1; count <= 10; count++) {
        appendNode(&start, count);
    }

    printf("Before adding a node: ");
    displayList(start);

    // Adds a new node with value 0 at the start
    prependNode(&start, 0);

    printf("\nAfter adding a node: ");
    displayList(start);

    return 0;
}


// Creates a new node with the given value and returns a pointer to it
Node *createNode(int value)
{
    Node *newNode = malloc(sizeof(Node));
    if (newNode == NULL) {
        fprintf(stderr, "Memory allocation failed\n");
        exit(EXIT_FAILURE);
    }
    newNode->data = value;
    newNode->next = NULL;
    return newNode;
}


// Appends a new node with the given value at the end of the list
void appendNode(Node **start, int value)
{
    Node *newNode = createNode(value);
    if (*start == NULL) {
        *start = newNode;
    }
    else {
        Node *current = *start;
        while (current->next != NULL) {
            current = current->next;
        }
        current->next = newNode;
    }
}


// Prepends a new node with the given value at the beginning of the list
void prependNode(Node **start, int value)
{
    Node *newNode = createNode(value);
    newNode->next = *start;
    *start = newNode;
}


// Displays all nodes in the linked list
void displayList(Node *start)
{
    Node *current = start;
    while (current != NULL) {
        printf("%d ", current->data);
        current = current->next;
    }
}
