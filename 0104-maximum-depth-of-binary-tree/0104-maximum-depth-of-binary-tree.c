/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
#include <math.h>
int maxDepth(struct TreeNode* t) 
{
    if (t == NULL)
        return 0;
    int left_depth = maxDepth(t->left);
    int right_depth = maxDepth(t->right);
    
    return 1 + fmax(left_depth, right_depth);
}