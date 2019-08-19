# Tree Traversal
* an **algorathm** that **iterates** through each node in t exactly **1** time.

## InOrder Traversal
* **Recursive** algorithm --> follow the left subtree first
* proceed to the right after left is completed
* process the tree's elements in ascending order

inOrder(t) {
    if(t is not empty) {
        inOrder( left subtree of t )
        process t's root element
        inOrder( right subtree of t )
    } 
} 


## PostOrder Traversal
* **recursive** algorithm-->follows the **left and right** subtrees before processing the **root**

postOrder(t) {
    if(t is not empty) {
        postOrder( left subtree of t )
        postOrder( right subtree of t )
        process t's root element
    } 
} 


## PreOrder Traversal (DFS)
* **recursive** algorithm --> processes the root and then performs preorder of the left and right 
* goes as deeply to the left

preOrder(t) {
    if(t is not empty) {
        process t's root element
        preOrder( left subtree of t )
        preOrder( right subtree of t )
    } 
} 


## Level-Order Traversal (BFS)
* **recursive** algorithm --> process the root, followed by children of the root from left to right, followed by the grandchildren.....
* goes level by level

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
           
 
