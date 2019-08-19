# Tree Traversal
* an **algorathm** that **iterates** through each node in t exactly **1** time.

## InOrder Traversal
* **Recursive** algorithm --> follow the left subtree first
* proceed to the right after left is completed
* process the tree's elements in ascending order
    * inOrder(t) {
      if(t is not empty) {
        inOrder( left subtree of t )
        process t's root element
        inOrder( right subtree of t )
        } 
      } 
## PostOrder Traversal
* **recursive** algorithm-->follows the **left and right** subtrees before processing the **root**
       * postOrder(t) {
            if(t is not empty) {
                postOrder( left subtree of t )
                postOrder( right subtree of t )
                process t's root element
            } 
        } 
## PreOrder Traversal (DFS)
* **recursive** algorithm --> processes the root and then performs preorder of the left and right 
* goes as deeply to the left

## Level-Order Traversal (BFS)
* **recursive** algorithm --> process the root, followed by children of the root from left to right, followed by the grandchildren.....
* goes level by level
