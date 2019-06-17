# data-structures-and-algorithms-Java
## Java401 CC - LinkedList

* Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node.
Within your LinkedList class, include a head property. Upon instantiation, an empty Linked List should be created.
This object should be aware of a default empty value assigned to head when the linked list is instantiated.
* Define a method called insert which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance.
* Define a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
* Define a method called print which takes in no arguments and returns a collection all of the current Node values in the Linked List.
***
* Add a method named .append(value) which adds a new node with the given value to the end of the list
* Add a method named .insertBefore(value, newVal) which add a new node with the given newValue immediately before the first value node
* Add a method named .insertBefore(value, newVal) which add a new node with the given newValue immediately before the first value node
***
* Write a method for the Linked List class which takes a number, k, as a parameter. Return the node’s value that is k from the end of the linked list. You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.
***
* Write a function called mergeLists which takes two linked lists as arguments. Zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the head of the zipped list. Try and keep additional space down to O(1). You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.
***
## Approach

Time: O(1);
Space: O(n);

***
## Solution

[Code](https://github.com/KKetter/CodeChallenge-Repo/blob/LinkedList/DSA%20401%20JAVA/src/main/java/DSA/JAVA/linkedList/LinkedList.java)

[Linked List Insertion WB Image 1](https://github.com/KKetter/CodeChallenge-Repo/blob/ll_insertion/assets/linkedListInsertion1.jpg)

[Linked List nth From the End WB Image 1](https://github.com/KKetter/CodeChallenge-Repo/blob/ll_insertion/assets/linkedListnthFromTheEnd1.jpg)

[Linked List Merge WB Image 1](https://github.com/KKetter/CodeChallenge-Repo/blob/ll_insertion/assets/linkedListMerge1.jpg)