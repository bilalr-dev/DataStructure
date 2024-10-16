package datastructureandalgorithmes;

public class main { 

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        
        printArrayState(dynamicArray);
        
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.insert(0, "NEW");
        dynamicArray.delete("A");

        printArrayState(dynamicArray);
        
        for (char letter = 'D'; letter <= 'P'; letter++) {
            dynamicArray.add(String.valueOf(letter));
        }

        printArrayState(dynamicArray);
        
        System.out.println(String.format("Object found at index: %d", dynamicArray.search("L")));
    }

    private static void printArrayState(DynamicArray dynamicArray) {
        System.out.println(dynamicArray);
        System.out.println("Empty? " + dynamicArray.isEmpty());
        System.out.println("Size: " + dynamicArray.size); 
        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println();
    }
}
