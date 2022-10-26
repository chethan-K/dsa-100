# Linked list

Linear data structure consists of node
- node with data and pointers to next node

### Singly linked list
- Traverse in one direction 
> head --> node1(data, node1Pointer) ---> node2(data, node2Pointer)
- insertion/deletion is easy as - We are just removing a node/adding a node

>In the case of an array, all subsequent elements need to be moved around. Of course, if you first have to search for the position to insert or delete in a linked list, then it still takes O(n) in the worst case.

- **cons** node also contains a pointer, it has a memory overhead.

- We will have to traverse from the start to access an element

> Insert at head/Delete at head --> O(1)

> Insert at tail/Delete at tail --> O(n)

```java
//Node inner class for DLL
public class Node<T> {
    public T data; //Stores data
    public Node nextNode; //Stores pointer to next element
}
```
```java
public class SinglyLinkedList<T> {
    //member variables
    public Node headNode;
    public int size;
}
```


### Doubly linked list
>- head --> **node1**(null, data, node1Pointer) ---> **node2**(node1Pointer, data, node2Pointer)
- Insert and delete at the head as well as tail are O(1) operations
- list can be traversed forward as well as backward

> Insert at head/Delete at head --> O(1)

> Insert at tail/Delete at tail --> O(1)


### Operations on linked list
- insertAtEnd(data)
- insertAtHead(data)
- delete(data)
- deleteAtHead()
- deleteAtEnd()
- Search(data)
- isEmpty()



> **Note:** Even when a linked list is empty, the head Node must always exist.


### Data access
- access O(n) whereas in array - it is O(1) as data can be accessed with the index.
- Linked list data insert/delete at head is O(1) whereas in array it is O(n) - as the array requires to be shifted
- For singly linked list insert at head/tail requires O(n) as it has to iterate over all.


## Doubly linked list DLL
**Problem with SLL** 
- Traversing is possible only from the headNode - uni-directional
- While adding/removing elements from the list, we need to keep track of the previous node as well

> (previousNode, data, nextNode)->(previousNode, data, nextNode)->(previousNode, data, nextNode)


```java
//Node inner class for DLL
public class Node<T> {
    public T data; //Stores data
    public Node nextNode; //Stores pointer to next element
    public Node prevNode; //Stores pointer to previous element
}
```
```java
public class DoublyLinkedList<T> {
    //member variables
    public Node headNode;
    public Node tailNode;
    public int size;
}
```

**Insert at head**
- newNode.nextNode = this.headNode
- headNode.prevNode = newNode
- headNode = newNode

**Insert at End**
- We simply insert the new node as the nextNode of the tailNode and then update the tailNode to point to the new node, after insertion
- newNode.prevNode = tailNode
- tailNode.nextNode = newNode
- tailNode = newNode

### Reversing the SLL
- next = current.next (Store the current node’s nextNode in next)
- current.next = prev (Set current node’s nextNode to previous (reversal))
- prev = current (Make the current node the new previous so that it can be used for the next iteration)
- current = next (Use next to move on to the next node)
