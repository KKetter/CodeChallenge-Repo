# Graph
<!-- Short summary or background information -->
***
## Challenge
* Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:
    * AddNode()
        * Adds a new node to the graph 
            - Takes in the value of that node
            - Returns the added node
    * AddEdge()
        * Adds a new edge between two nodes in the graph
            - Include the ability to have a “weight”
            - Takes in the two nodes to be connected by the edge
            - Both nodes should already be in the Graph
    * GetNodes()
        * Returns all of the nodes in the graph as a collection (set, list, or similar)
    * GetNeighbors()
        * Returns a collection of nodes connected to the given node
            - Takes in a given node
            _ Include the weight of the connection in the returned collection
    * Size()
        * Returns the total number of nodes in the graph    
***   
## Approach & Efficiency
Time: O(n)
Space: O(n)
***
## API
* Graph
    - AddNode()
    - AddEdge()
    - GetNodes()
    - GetNeighbors()
    - Size()

## Solution
![Graph Code](https://github.com/KKetter/CodeChallenge-Repo/blob/Graph/Graph.java)