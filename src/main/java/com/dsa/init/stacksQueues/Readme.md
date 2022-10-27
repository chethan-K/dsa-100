## Stacks
- LIFO (Last in first out)
- **push()**, **pop()**, **top()**, **size()**, **isEmpty()**

### Used for
- To backtrack to the previous state/task
- To store the partially completed tasks
- Also used in DFS algo and Expression evaluation algo

### Complexities
- push, pop, top --> O(1)

**stack members**
```java

this.maxSize = max_size; // set during the creation of stack
this.top = -1; //initially when stack is empty
array = (V[]) new Object[max_size]; //type casting Object[] to V[]

```
**push**
```java
// inserts a value to the top of Stack
public void push(T value){
    array[++top] = value; //increments the top and adds value to updated top
}
```

**pop**
```java
// removes a value from top of Stack and returns
public T pop(){
    return array[top--]; //returns value and top and decrements the top
}
```

**top**
```java
// returns the value at top of Stack
public V top(){
    return array[top];
}
```



## Queue
- Storage and retrieval is First in first out
- enqueue, dequeue, front, size, isEmpty, isFull

### Enqueue
```java
    public void enqueue(V value) {
        back = (back + 1) % maxSize; //to keep the index in range
        arr[back] = value;
        currentSize++;
    }
```

### Dequeue
```java
    public T dequeue() {
        T temp = array[front];
        front = (front + 1) % maxSize; //to keep the index in range
        currentSize--;
        return temp;
    }
```
### Queue members
```java
    int maxSize;
    T[] array = (T[]) new Object[maxSize];
    int front=0;
    int back=-1;
    int currentSize;
```

### Used for
- Prioritize something over another
- Resource is shared between multiple devices


### 1. Implement queue using stack (with EnQ faster)
- Define stack1, stack2
- if stack2 is empty -> pop all stack1 and push on stack2
- pop top value from stack2
- stack1 - 1,2,3,4,5
- stack2 - 5,4,3,2,1 = stack1 is empty
- pop from stack2 which is 5
- Transfer of elements between stacks takes place only if stack2 is empty
- So enQ and DQ O(1)

### 2. Implement queue using stack (with Dq faster)
- Before enQueue
- push stack1 to stack2
- then push the value to stack1
- push stack2 to stack1

