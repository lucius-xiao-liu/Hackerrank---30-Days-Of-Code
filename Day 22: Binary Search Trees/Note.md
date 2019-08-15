# Graphs and trees
## Heap
* root has special relationship with children, but children have no relationship with each others
### Min-Heap
* smaller data at the root, everything in the tree must have a larger value than the root
* the branches can be  equal
* no specific order requirements
### Max-Heap
* largest data at the root, everything in the tree must have a smaller value than the root

## Binary Trees
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


## Binary Search Trees (BSTs), t:
* Is Binary Tree
* either empty or MUST satisfies with the following conditions:
    * max(leftTree(t).value)<=t.value;
    * min(rightTree(t).value) > t.value;
* Breadth-first search (BFS):
   * algorithm for searching tree or graph, or queue
   * starts at the root
   * discovers each node on a level of a tree before moving to the next level
* Depth-first search (DFS):
   * deeper in the tree before goes back to another branch
