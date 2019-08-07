# Queues and Stacks
* They are all **Data Structure**

### Stacks
* LIFO
* operations:
    * Peek: Return the object at the top of the stack (without removing it).
    * Push: Add an object passed as an argument to the top of the stack.
    * Pop: Remove the object at the top of the stack and return it.
* It is a class in Java.util.*
* Extends class Vector (Vector can be stack)
   * Vector: growable array of  abjects

### Queues
* FIFO (Typically but do not necessarily)
    * Exceptions:
    * priority queues -> order elements according to a supplied comparator
    * LIFO queues (Stack) -> Order elements LIFO
* Operations: 
    * Enqueue: Add an object to the back of the line
        * offer() OR add()
    * Dequeue: Remove the object at the head of the line and return it; the element that was previously second in line is now at the head of the line
        * remove() OR poll()
    * Peek/element: Returns the head of the queue but not removes
* Interface in Java.util.*
* Not allows null elements 
* poll() = null: no elements in  the queue
