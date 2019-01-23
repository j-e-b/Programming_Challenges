#include <stdio.h>
#include <stdlib.h>

/*
Write a function that returns 1 if every leaf node in a given binary tree
contains a negative integer. Otherwise, return 0.
(For an empty tree, you can just return 1.)
*/

typedef struct node
{
	struct node *left;
	struct node *right;
	int data;
} node;

int negLeaves(node *root)
{
	if (root == NULL)
		return 1;

	if (root->left == NULL && root->right == NULL)
		return (root->data < 0);

	return negLeaves(root->left) && negLeaves(root->right);
}
