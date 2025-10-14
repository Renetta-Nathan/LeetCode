/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

int* inorderTraversal(struct TreeNode* root, int* returnSize) {
    *returnSize = 0;
    if (root == NULL) return NULL;

    int *result = (int*)malloc(1000 * sizeof(int));
    struct TreeNode *curr = root;
    struct TreeNode *pre;

    while (curr != NULL) {
        if (curr->left == NULL) {
            result[(*returnSize)++] = curr->val;
            curr = curr->right;
        } else {
            pre = curr->left;
            while (pre->right != NULL && pre->right != curr)
                pre = pre->right;

            if (pre->right == NULL) {
                pre->right = curr;
                curr = curr->left;
            } else {
                pre->right = NULL;
                result[(*returnSize)++] = curr->val;
                curr = curr->right;
            }
        }
    }

    return result;
}
