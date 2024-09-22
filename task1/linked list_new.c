#include <stdio.h>
#include <stdlib.h>

// Define the structure for a linked list node
struct Node {
    int data;
    struct Node *next;
};

// Typedef for the Node structure to simplify usage
typedef struct Node Node;

// Function to create and return a new node
Node* createNode(int value) {
    Node *newNode = (Node *)malloc(sizeof(Node));
    if (!newNode) {
        perror("Failed to allocate memory");
        exit(EXIT_FAILURE);
    }
    newNode->data = value;
    newNode->next = NULL;
    return newNode;
}

// Function to print the linked list
void printList(Node *head) {
    Node *current = head;
    while (current != NULL) {
        printf("%d ", current->data);
        current = current->next;
    }
    printf("\n");
}

// Function to free the linked list memory
void freeList(Node *head) {
    Node *current = head;
    while (current != NULL) {
        Node *temp = current;
        current = current->next;
        free(temp);
    }
}

int main(void) {
    Node *head = NULL, *current = NULL;

    // Create linked list with values 0 to 30
    for (int i = 0; i < 31; i++) {
        Node *newNode = createNode(i);
        if (i == 0) {
            head = newNode; // Set head for the first node
        } else {
            current->next = newNode; // Link previous node to new node
        }
        current = newNode; // Move current to new node
    }

    // Print the linked list
    printf("The linked list: ");
    printList(head);

    // Free allocated memory
    freeList(head);

    return 0;
}
