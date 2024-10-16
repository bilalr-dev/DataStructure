package datastructureandalgorithmes;

public class DynamicArray {
    int size;
    int capacity;
    Object[] array;

    public DynamicArray() {
        this.capacity = 10;
        this.array = new Object[capacity];
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data) {
        if (size >= capacity) {
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (size >= capacity) {
            grow();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }

    public boolean delete(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) { 
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[size - 1] = null;
                size--;
                if (size <= capacity / 3) {
                    shrink();
                }
                return true; 
            }
        }
        return false; 
    }

    public int search(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) { 
                return i; 
            }
        }
        return -1; 
    }

    private void grow() {
        int newCapacity = capacity * 2; 
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size); 
        capacity = newCapacity;
        array = newArray;
    }

    private void shrink() {
        int newCapacity = Math.max(10, capacity / 2); 
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size); 
        capacity = newCapacity;
        array = newArray;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            str.append(array[i]);
            if (i < size - 1) {
                str.append(", "); 
            }
        }
        str.append("]");
        return str.toString();
    }
}
