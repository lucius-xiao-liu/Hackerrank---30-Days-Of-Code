# Binary Trees
* composed nodes connected by edges
* a node has MAXIMUM 2 children
* root at the top and subtrees branch down from root
* subtrees = children; root/node is not leaf = parent/ancestor
* Leaf: non-root with no children
* depth of tree: calculate by # of edge, from  root to the node. (root's depth = 0)
* height: furtest depth of the tree
* height(t) = 1+ (max(height(root.leftChild),height(root.rightChild))); 
    * empty subtrees = -1
    * single element tree/leaf = 0


# Binary Search Trees (BSTs), t:
* Is Binary Tree
* either empty or MUST satisfies with the following conditions:
    * max(leftTree(t).value)<=t.value;
    * min(rightTree(t).value) > t.value;
