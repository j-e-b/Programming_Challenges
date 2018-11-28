#include <limits.h>
#include <stdio.h>
#include <stdlib.h>

typedef struct TreeNode
{
	int val;
	struct TreeNode *left;
	struct TreeNode *right;
} TreeNode;

TreeNode *constructMaxBinaryTree(int *nums, int numsSize)
{
	TreeNode *root;
	int i, max = INT_MIN, index = 0;

	if (numsSize == 0)
	{
		return NULL;
	}

	// Find the max value in this (sub) array.
	for (i = 0; i < numsSize; i++)
	{
		if (nums[i] > max)
		{
			max = nums[i];
			index = i;
		}
	}
	// Construct root based on that max value.
	root = malloc(sizeof(TreeNode));
	root->val = max;

	// Construct the root's children using recursion.
	root->left = constructMaxBinaryTree(nums, index);
	root->right = constructMaxBinaryTree(nums + index + 1, numsSize - index - 1);

	return root;
}

int main(void)
{
	return 0;
}
