/*
levelOrder(BinaryTree t) {
    if(t is not empty) {
        // enqueue current root
        queue.enqueue(t)
        
        // while there are nodes to process
        while( queue is not empty ) {
            // dequeue next node
            BinaryTree tree = queue.dequeue();
            
            process tree's root;
            
            // enqueue child elements from next level in order
            if( tree has non-empty left subtree ) {
                queue.enqueue( left subtree of t )
            }
            if( tree has non-empty right subtree ) {
                queue.enqueue( right subtree of t )
            }
        }
    } 
} 
*/

static void levelOrder(Node root){
      //Write your code here
      Queue<Node> tree = new LinkedList<>();

      if (root != null) {
          tree.add(root);
          while (tree.isEmpty()==false){
              Node node = tree.remove();
              System.out.print(node.data + " ");
              if  (node.left != null) {
                  tree.add(node.left);
              }
              if (node.right != null) {
                  tree.add(node.right);
              }
          }
      }
}
