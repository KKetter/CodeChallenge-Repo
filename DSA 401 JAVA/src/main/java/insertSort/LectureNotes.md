#Insert Sort
##Learning Objective
    Insertion Sort is an efficient algorithm for ordering a small number of items. This method is based on the way card players sort a hand of playing cards.
    
    We start with an empty left hand and the cards laid down on the table. We then remove one card at a time from the table and insert it into the correct position in the left hand. To find the correct position for a new card, we compare it with the already sorted set of cards in the hand, from right to left.
***
    Lecture Flow
        Main Point: Cards in Hand example
            Supporting Points - Efficeiency O(n^2), can reduce to O(logn)
        Main Point: Alogorithm/visual on board using card example

##Diagram
    
    Start...4,3,2,10,12,1,5,6
            3,4,2,10,12,1,5,6
            2,3,4,10,12,1,5,6
            1,2,3,4,10,12,5,6
            1,2,3,4,5,10,12,6
    End.....1,2,3,4,5,6,10,12
    
    

##Algorithm
    -Insertion sort is based on the idea that one element from the input elements is consumed in each iteration to find its correct position i.e, the position to which it belongs in a sorted array.
    -It iterates the input elements by growing the sorted array at each iteration. It compares the current element with the largest value in the sorted array.
    -If the current element is greater, then it leaves the element in its place and moves on to the next element else it finds its correct position in the sorted array and moves it to that position. 
    -This is done by shifting all the elements, which are larger than the current element, in the sorted array to one position ahead"
    

##Pseudocode
InsertionSort(int[] arr)
  
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp

##Readings and References
-Watch

[Geeks for Geeks - Insert Sort Video](https://www.youtube.com/watch?v=OGzPmgsI-pQ)

-Website

[Geeks for Geeks - Insert Sort](https://www.geeksforgeeks.org/insertion-sort/)

[Baeldung - Insert Sort](https://www.baeldung.com/java-insertion-sort)