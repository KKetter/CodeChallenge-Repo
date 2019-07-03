#Quick Sort
Summary Goes Here
##Learning Objective
    
***
    Lecture Flow
        Main Point: x
            Supporting Point - x
        Main Point: x
            Supporting Point - x
                  
                
                     
##Diagram
    
    Start...
    End.....
    
    

##Algorithm

##Pseudocode w/ recursive implementation using a helper function(merge)
ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition the array by setting the position of the pivot value 
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right. 
   Swap(arr, right, low + 1)
   return low + 1

ALGORITHM Swap(arr, i, low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp
##Readings and References
    
-Watch

[Hacker Rank - Quick Sort Video](https://www.youtube.com/watch?v=SLauY6PpjW4)

-Website

[Geeks for Geeks - Quick Sort](https://www.geeksforgeeks.org/quick-sort/)

[HackerEarth - Quick Sort](https://www.hackerearth.com/practice/algorithms/sorting/quick-sort/tutorial/)