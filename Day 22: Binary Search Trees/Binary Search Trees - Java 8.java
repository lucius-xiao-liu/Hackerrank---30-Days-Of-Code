
public static int getHeight(Node root){
      //Write your code here
      //if it is an empty BST:
      if (root == null) {
          return -1;
      }
      //if it is a non-empty tree, return the height.
      else{
          return 1+(Math.max(getHeight(root.left),getHeight(root.right)));

      }
    }
