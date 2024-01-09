/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    ArrayList<Integer> arr1 = new ArrayList<>();
    ArrayList<Integer> arr2 = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    bst1(root1);
    bst2(root2);
        if(arr1.equals(arr2)){
            return true;
        }
        return false;
     }
    public void bst1(TreeNode ar1){
        if(ar1 == null){
            return;
        }
        if(ar1.left == null && ar1.right == null){
            arr1.add(ar1.val) ;      
            }
        bst1(ar1.left);
        bst1(ar1.right);
    }
    public void bst2(TreeNode ar2){
        if(ar2 == null){
            return;
        }
        if(ar2.left == null && ar2.right == null){
            arr2.add(ar2.val) ;      
            }
        bst2(ar2.left);
        bst2(ar2.right);
        
    }
}