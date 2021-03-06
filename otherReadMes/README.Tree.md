# Tree
<!-- Short summary or background information -->
***
## Challenge
* Java: a package named tree which contains a file called Tree.java
* Create a Node class that has properties for the value stored in the Node, and a pointer to the left and right children.
* Create a BinaryTree class
    * Define a method for each of the depth first traversals called preOrder, inOrder, and postOrder which returns an array of the values, ordered appropriately.
* Create a BinarySearchTree class
    * Define a method named add that accepts a value, and adds a new node with that value in the correct location in the binary search tree.
    * Define a method named contains that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.

* Write a breadth first traversal method which takes a Binary Tree as its unique input. Without utilizing any of the built-in methods available to your language, traverse the input tree using a Breadth-first approach.
    * Print every visited node’s value.
    
* Write a function called find-maximum-value which takes binary tree as its only input. 
    * Without utilizing any of the built-in methods available to your language, return the maximum value stored in the tree.
    
***   
## Approach & Efficiency
Time: O(n)
Space: O(n)
***
## API
* BinaryTree
    * preOrder()
    * inOrder()
    * postOrder()
    * breadthFirst()
    * findMaxValue()
* BinarySearchTree
    * add() - accepts a value, and adds a new node with that value in the correct location in the binary search tree.
    * contains() - accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.

## Solution
![Binary Tree Code](https://github.com/KKetter/CodeChallenge-Repo/blob/Tree/DSA%20401%20JAVA/src/main/java/tree/BinaryTree.java)
![Binary Search Tree Code](https://github.com/KKetter/CodeChallenge-Repo/blob/Tree/DSA%20401%20JAVA/src/main/java/tree/BinarySearchTree.java)
![Breadth First](https://github.com/KKetter/CodeChallenge-Repo/blob/Tree/DSA%20401%20JAVA/src/main/java/tree/BinaryTree.java)
![Breadth First WB](https://github.com/KKetter/CodeChallenge-Repo/blob/MultiBracketValidation/assets/breadthFirst1.JPG)
![Max Value WB](https://github.com/KKetter/CodeChallenge-Repo/blob/MultiBracketValidation/assets/maxValue1.JPG)