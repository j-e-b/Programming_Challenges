#include <limits.h>
#include <stdio.h>
#include <stdlib.h>

/*
Given an integer array with no duplicates. A maximum tree building on this
array is defined as follow:

The root is the maximum number in the array.
The left subtree is the maximum tree constructed from left part subarray
divided by the maximum number.
The right subtree is the maximum tree constructed from right part subarray
divided by the maximum number.
Construct the maximum tree by the given array and output the root node of this
tree.

Example 1:
Input: [3,2,1,6,0,5]
Output: return the tree root node representing the following tree:

      6
    /   \
   3     5
    \    /
     2  0
       \
        1
Note:
The size of the given array will be in the range [1,1000].
*/

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
