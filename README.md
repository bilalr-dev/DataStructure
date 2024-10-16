# Dynamic Arrays

## Overview

A **Dynamic Array** is a data structure that allows for the storage of a resizable array of elements. Unlike static arrays, which have a fixed size determined at the time of creation, dynamic arrays can grow or shrink as needed. This flexibility makes dynamic arrays a popular choice for many applications, especially when the size of the data set is not known in advance.

## Key Features

- **Dynamic Resizing**: The array can increase or decrease its size based on the number of elements it needs to store.
- **Random Access**: Like static arrays, dynamic arrays allow for constant time access to elements via their index.
- **Overhead Management**: Dynamic arrays may involve some overhead due to resizing and copying elements when the array grows or shrinks.

## Complexity Analysis

Understanding the time and space complexity of dynamic arrays is crucial for evaluating their performance.:

| Operation        |    Time Complexity   |     Space Complexity    |
|------------------|----------------------|-------------------------|
| Add              | **O(1)** (amortized) | **O(n)** (when resized) |
| Insert           | **O(n)**             | **O(n)**                |
| Delete           | **O(n)**             | **O(n)**                |
| Search           | **O(n)**             | **O(1)**                |
| Access           | **O(1)**             | **O(1)**                |

- **Add**: Appending an element at the end of the dynamic array is typically O(1). However, if the array needs to be resized, the operation becomes O(n) due to copying the elements to the new array. This is why we refer to it as O(1) *amortized* time.
  
- **Insert**: Inserting an element at a specific index requires shifting elements, resulting in O(n) time complexity.

- **Delete**: Similar to insertion, deleting an element involves shifting elements to fill the gap, which also results in O(n) time complexity.

- **Search**: Searching for an element requires checking each element in the array, resulting in O(n) time complexity.

- **Access**: Accessing an element by index is O(1) since it allows direct indexing.

## Basic Operations

Here are some common operations you can perform with a dynamic array:

1. **Add**: Append an element to the end of the array.
2. **Insert**: Insert an element at a specified index.
3. **Delete**: Remove an element from the array.
4. **Search**: Find the index of a specific element.
5. **Grow**: Increase the size of the array when needed.
6. **Shrink**: Decrease the size of the array when needed.
