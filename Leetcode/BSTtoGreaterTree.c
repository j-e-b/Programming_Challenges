#include <stdio.h>
#include <stdlib.h>

/*
Given a Binary Search Tree (BST), convert it to a Greater Tree such that every
key of the original BST is changed to the original key plus sum of all keys
greater than the original key in BST.

Example:

Input: The root of a Binary Search Tree like this:
              5
            /   \
           2     13

Output: The root of a Greater Tree like this:
             18
            /   \
          20     13

*/

typedef struct TreeNode
{
	int val;
	struct TreeNode *left;
	struct TreeNode *right;
} TreeNode;

typedef struct Sum
{
	int val;
} Sum;

void convertBSTrecursive(TreeNode *root, Sum *sum)
{
	if (root == NULL)
	{
		return;
	}

	convertBSTrecursive(root->right, sum);
	sum->val += root->val;
	root->val = sum->val;
	convertBSTrecursive(root->left, sum);
}

TreeNode *convertBST(TreeNode *root)
{
	Sum *sum = calloc(1, sizeof(Sum));

	convertBSTrecursive(root, sum);

	free(sum);

	return root;
}
