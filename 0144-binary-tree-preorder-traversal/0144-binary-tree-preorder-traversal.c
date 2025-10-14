/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* preorderTraversal(struct TreeNode* root, int* returnSize) {
    *returnSize = 0;
    if (root == NULL) return NULL;

    int *result = (int*)malloc(1000 * sizeof(int));   // store output
    struct TreeNode* stack[1000];                     // stack for nodes
    int top = -1;

    stack[++top] = root; // start with root

    while (top != -1) {
        struct TreeNode* node = stack[top--];     // pop top node
        result[(*returnSize)++] = node->val;      // visit root first

        // Push right first, so left is processed next (stack = LIFO)
        if (node->right)
            stack[++top] = node->right;
        if (node->left)
            stack[++top] = node->left;
    }

    return result;
}
