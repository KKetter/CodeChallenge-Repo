# Stacks and Queues
<!-- Short summary or background information -->
***
## Challenge
* Create a Node class that has properties for the value stored in the Node, and a pointer to the next node.
* Create a Stack class that has a top property. It creates an empty Stack when instantiated.
    * This object should be aware of a default empty.
* Create a Queue class that has a top property. It creates an empty queue when instantiated.
    * This object should be aware of a default empty value assigned to front when the queue is created.

***
## Approach & Efficiency
Time: O(n) - I dont expect nested loops
Space: O(1) - temp node?
***
## API
<!-- Description of each method publicly available to your Stack and Queue-->
* Stack
    * push() - takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance
    * pop() - that does not take any argument, removes the node from the top of the stack, and returns the node’s value
    * peek() - Define a method called peek that does not take an argument and returns the value of the node located on the top of the stack
* Queue
    * enqueue() - takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance
    * dequeue() - that does not take any argument, removes the node from the front of the queue, and returns the node’s value
    * peek() - returns the value of the node located in the front of the queue
