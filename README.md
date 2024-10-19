# Search Algorithms with Java

This project implements three commonly used search algorithms in Java: **Linear Search**, **Binary Search**, and **Interpolation Search**. Each algorithm is designed to search for a target value in a **sorted** array.

## Algorithms Overview

### 1. Linear Search
**Linear Search** is the simplest search algorithm. It works by iterating through the array, checking each element to see if it matches the target value. The algorithm stops as soon as it finds the target or exhausts the entire array.

#### Algorithm with Explanation:
```java
public class LinearSearch {
    public int search(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) return i; // Return the index if the target is found
        }
        return -1; // Return -1 if the target is not found
    }
}
```

***Time Complexity:***
* Best Case: O(1) - When the target is the first element.
* Worst Case: O(n) - When the target is at the end or not present.
* Space Complexity: O(1) - No additional space is used.

### 2.Binary Search
**Binary Search** is a more efficient search algorithm, but it requires the array to be sorted. It works by repeatedly dividing the search interval in half. If the value of the target is less than the item in the middle of the interval, the algorithm narrows the interval to the lower half. If the value is greater, it narrows it to the upper half.

#### Algorithm with Explanation:
```java
public class BinarySearch {
    public int search(int[] array, int target) {
        int maxBoundary = array.length - 1;
        int minBoundary = 0;

        while (minBoundary <= maxBoundary) {
            int mid = minBoundary + (maxBoundary - minBoundary) / 2;

            if (array[mid] == target) return mid; // Target found
            else if (array[mid] < target) minBoundary = mid + 1; // Search in the upper half
            else maxBoundary = mid - 1; // Search in the lower half
        }
        return -1; // Target not found
    }
}
```

***Time Complexity:***
* Best Case: O(1) - When the middle element is the target.
* Worst Case: O(log n) - At each iteration, the search space is halved.
* Space Complexity: O(1) - No additional space is used.

### 3.Interpolation Search
**Interpolation Search** is similar to Binary Search, but instead of dividing the array in half, it estimates the position of the target value based on its value. It works best on uniformly distributed data.

#### Code Explanation:
```java
public class InterpolationSearch {
    public int search(int[] array, int target) {
        int maxBoundary = array.length - 1;
        int minBoundary = 0;

        while (target <= array[maxBoundary] && target >= array[minBoundary] && minBoundary <= maxBoundary) {
            int mid = minBoundary + ((target - array[minBoundary]) * (maxBoundary - minBoundary)) 
                    / (array[maxBoundary] - array[minBoundary]);

            if (array[mid] == target) return mid; // Target found
            else if (array[mid] < target) minBoundary = mid + 1; // Search in the upper half
            else maxBoundary = mid - 1; // Search in the lower half
        }
        return -1; // Target not found
    }
}
```

***Time Complexity:***
* Best Case: O(1) - When the mid element is the target.
* Worst Case: O(log log n) - The search space reduces faster than Binary Search.
* Space Complexity: O(1) - No additional space is used.

### Main.java 
In the **Main.java** file, you can test each search algorithm. The example below shows how to use each search method with a sample array: 

```java
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048};
        int target = 512;

        // LinearSearch
        LinearSearch linearSearch = new LinearSearch();
        int result = linearSearch.search(array, target);
        System.out.println("Target found at index: " + result);

        // BinarySearch
        BinarySearch binarySearch = new BinarySearch();
        result = binarySearch.search(array, target);
        System.out.println("Target found at index: " + result);

        // InterpolationSearch
        InterpolationSearch interpolationSearch = new InterpolationSearch();
        result = interpolationSearch.search(array, target);
        System.out.println("Target found at index: " + result);
    }
}

```
### Conclusion:
* Linear Search is simple but less efficient for large arrays.
* Binary Search is efficient for sorted arrays and runs in logarithmic time.
* Interpolation Search can be more efficient than Binary Search for uniformly distributed data.

