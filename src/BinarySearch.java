public class BinarySearch {
    public int search(int[] array, int target) {
        int maxBoundary, minBoundary;
        maxBoundary = array.length-1;
        minBoundary = 0;
        while (minBoundary <= maxBoundary){
            int mid = minBoundary + (maxBoundary - minBoundary)/2;
            if(array[mid] == target) return mid;
            else if (array[mid]<target) minBoundary = mid +1;
            else maxBoundary = mid -1 ;
        }
        return -1;

    }
}
