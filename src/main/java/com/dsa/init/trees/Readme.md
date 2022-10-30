## Trees

> **Trees** consist of vertices(nodes) and edges which connects them.

> **EDGE** ordered pair of nodes

> Unlike linear data structures - trees are hierarchical

> If (u,v) represent an edge in a tree => u is parent of v, v is child of u

> **Each node contains a value**

> Difference b/w trees/graph is that => trees are acyclic and path b/w two nodes is always unique


### Standard terminologies

- **Root Node**  - Node with no parent
- **Parent and Child Nodes** - if u and v are nodes in a tree => (u,v) is edge, u is parent of v
- **Sibling Node** - Nodes with same parent
- **Leaf Node** - Node with no child node
- **Ancestor Nodes** - Nodes in the path from the current node to root node
- **Descendant Nodes** - Child nodes, grand children nodes ..etc
- **Sub-tree** - Tree under a given node is sub-tree which includes all the descendants
- **Degree-of-node** - Total number of children of a node
- **Path** - Path between nodes u and v is an alternating sequence if nodes and edges. no node repeated. Exactly one path
- **Length of a path** - Number of edges in a path
- **Depth of a node** - Length of path from node to root node. depth of root node - 0
- **Level of node** - Depth of node + 1
- **Height of a node** - The length of node from n to its deepest descendents - height of leaf is 0
- **Height of tree** - height of root node

> ## Binary tree - Node can have at most 2 nodes
- Full/proper binary - Every node has two children
- Complete binary - Every level except possibly the last one are filled - leaf nodes are as far as left possible


## Traversing a tree
- Traversing a tree means - visiting every node in the tree.
- In the linear DS like stacks, queues and LL's there is only one way to read the data.
- But, in hierarchical DS like tree -> it can be traversed in different ways

### Inorder
- inorder(root -> left)
- display the root node (root->data)
- inorder(root -> right)

### Preorder
- display the root node (root->data)
- preorder(root -> left)
- preorder(root -> right)

### Postorder
- postOrder(root -> left)
- postOrder(root -> right)
- display the root node (root->data)