public class InterpolationSearch {
    public int search(int[] array, int target) {
        int maxBoundary = array.length - 1;
        int minBoundary = 0;

        while(target <= array[maxBoundary] && target >= array[minBoundary] && minBoundary <= maxBoundary){
            int mid = minBoundary + ((target - array[minBoundary]) * (maxBoundary - minBoundary))
                    / (array[maxBoundary] - array[minBoundary]);
            if (array[mid] == target) return mid;
            else if (array[mid] <= target) minBoundary = mid + 1;
            else maxBoundary = mid - 1;
        }
        return -1;
    }
}
