#Merge Sort
##Learning Objective
    -Merge sort is a recursive algorithm that divides the input array in two halves, 
    calls itself for the two halves and then merges the two sorted halves 
    -If the list is empty or has one item, it is sorted by definition (the base case). 
    -If the list has more than one item, we split the list and recursively invoke a merge sort on both halves. 
    -Once the two halves are sorted, the fundamental operation, called a merge, is performed.
***
    Lecture Flow
        Main Point: Recurisve Algorithm which splits list in half continually
            Supporting Point - Efficiency is O(n Log(n)), Space is O(n)
        Main Point: Helper/Fundamental Operation merge two halves back together
            Supporting Point - Sorting Example: Middle Steps
                     -2,3     8,14
                     -2 compared to 8 result is 2 sorted     
                     -Then compare 3 to 8 to check if both left values are greater than right result is 3 is then sorted
                     -Always look for higher value in single pairs to so full list check is only done during final merge
                  
                
                     
##Diagram
    
    Start...11,3,8,12,15,6
    LEFT
    11,3,8
    11,3  
    11 
    3
    3,11
    8
    3,8,11
    RIGHT
    12,15,6
    12,15
    12
    15
    12,15
    6
    6,12,15
    MERGE
    End.....3,6,8,11,12,15
    
    

##Algorithm

##Pseudocode w/ recursive implementation using a helper function(merge)
ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length
           
    if arr.length > 1
      DECLARE mid <-- n/2
      DECLARE b <-- arr[0...mid]
      DECLARE c <-- arr[mid...n]
      // break down the left side
      Mergesort(b)
      // break down the right side
      Mergesort(c)
      // merge the left and the right side together
      Merge(b, c, arr)

ALGORITHM Merge(b, c, a)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < b && j < c
        if b[i] <= c[j]
            a[k] <-- b[i]
            i <-- i + 1
        else
            a[k] = c[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = b.length
       add remaining items in array c to array a
    else
       add remaining items in array b to array a
       
    return a
##Readings and References
-Watch

[Geeks for Geeks - Merge Sort Video](https://www.youtube.com/watch?v=JSceec-wEyw)

-Website

[Geeks for Geeks - Merge Sort](https://www.geeksforgeeks.org/merge-sort/)

[Runestone - Merge Sort](https://runestone.academy/runestone/static/pythonds/SortSearch/TheMergeSort.html)