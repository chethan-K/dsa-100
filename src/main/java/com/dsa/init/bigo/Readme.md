f(n)=3n<sup>3</sup>+4n+2 --> O(n<sup>3</sup>)

> Suppose algorithms A and B have running time of O(n<sup>3</sup>) and O(n<sup>2</sup>), respectively. For sufficiently large input sizes, algorithm A will run faster than algorithm B. That does not mean that algorithm A will always run faster than algorithm B.

> Algorithm A and B both have running time O(n<sup>2</sup>). The execution time for these algorithms, for very large input sizes, will be within constant factors of each other. For all practical purposes, they are considered equally good.


### How Big O is calculated

- Get time complexity of an algo by counting the premitive operations
- Drop multiplicative constants with all terms
- Drop all but the higher order terms
- n<sup>2</sup> + 2n + 1 is O(<sup>2</sup>) 
- n<sup>3</sup> + 4n<sup>2</sup> + 2n + 43 is O(<sup>3</sup>)


### Any function finally boils down to one of the following Big O
- constant
- logarithmic - logn
- log-square log<sup>2</sup>n
- root of n
- linear - n
- nlogn
- quadratic n<sup>2</sup> 
- cubic n<sup>3</sup>
- Quartic n<sup>4</sup>
- Exponential 2<sup>n</sup>
- factorial n!


### e<sup>3n</sup> is in O(e<sup>n</sup>) ..? 
No - e<sup>3n</sup> ≤ ce<sup>n</sup> must be satisfied and e<sup>3n</sup> ⇒ e<sup>n</sup>e<sup>2n</sup>
constant c cannot be found.

### General tips
- When number of elements in the problem space gets halved each time  - it is O(logn)
- single nested loop ==> quadratic
- for loop -> c*n -> O(n)
- for loop with increment of size k --> c * n/k  --> O(n)
- Sample nested loop O(nm)
- if the inner loop modifies the index then also -> it boils to O(n<sup>2</sup>) but a tight bound

```java
k is constant and modifing the outer index. ==> log with base k of n
 while (i < n){
    i*=k;
    // Statement(s) that take(s) constant time
} 
1,2,4,8,16 ==> 1,2,3,4,5
```

>Big O notation denotes an upper bound but is silent about the lower bound. Treat it like a cap on the worst that can happen. So when someone says that an algorithm has a lower bound of O(n2) that translates into saying the lower bound can at worst be quadratic in complexity. By definition, the lower bound is the best an algorithm can perform. 


>Counting Sort and Radix Sort are two algorithms which have the same best, worst and average case complexities. 

----------

**>What are the two main measures for the efficiency of an algorithm?**
- **Time** refers to the runtime efficiency of the algorithm. 
- **Space** refers to the amount of memory your alogrithm reuqires.

### Cheatsheet
**Array**
- Insert -> O(1)
- Retrieve -> O(1)

**Linked list** 
- Insert at Tail -> O(n)
- Insert at Head -> O(1)
- Retrieve -> O(n)

if new elements are added at the head of the linkedlist then insert becomes a O(1) operation.


**Binary Tree**
- Insert -> O(n)
- Retrieve -> O(n)

In worst case, the binary tree becomes a linked-list.

**Dynamic Array**
- Insert -> O(1)
- Retrieve -> O(1)

**Stack**
- Push -> O(1)
- Pop -> O(1)

**Queue**
- enqueue -> O(1)
- dequeue -> O(1)

**Priority Queue**
- Insert -> O(logn)
- Delete -> O(logn)
- Get max/min -> O(1)

**Hashtable**
- Insert -> O(n)
- Retrieve -> O(n)

hashtable's average case for insertion and retrieval is O(1)

**B-Trees / Red-Black Trees**
- Insert -> O(logn)
- Retrieve -> O(logn)

**Sorting**
- Bubble/insertion/selection/Quick = O(n<sup>2</sup>)
- Merge Sort - nlogn

Average of Quick sort is nlogn

**Tree**
- Depth first search -> O(n)
- Breadth first search -> O(n)
- preorder/in-order/post-order traversal -> O(n)

n is the total number of nodes in the tree. Most tree-traversal algorithms will end up seeing every node in the tree and their complexity in the worst case is thus O(n).
