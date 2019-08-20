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
