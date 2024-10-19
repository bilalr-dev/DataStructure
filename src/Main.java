public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,4,8,16,32,64,128,256,512,1024,2048};
        int target = 512;
        double startTime,endTime,elapsedTime;

        /**
        LinearSearch
        LinearSearch linearSearch = new LinearSearch();
        int result = linearSearch.search(array, target);
        **/

        /**
         BinarySearch

         BinarySearch binarySearch = new BinarySearch();
         startTime = System.nanoTime();
         int result = binarySearch.search(array,target);
         if (result!=-1) System.out.println("Target found");
         else System.out.println("Target not found");
         endTime = System.nanoTime();
         elapsedTime = (endTime - startTime) / 1_000_000.0;
         System.out.println("Elapsed time: " + elapsedTime + " ms");
         **/

        /**

         InterpolationSearch

        InterpolationSearch interpolationSearch = new InterpolationSearch();
        startTime = System.nanoTime();
        int result = interpolationSearch.search(array,target);
        if (result!=-1) System.out.println("Target found");
        else System.out.println("Target not found");
        endTime = System.nanoTime();
        elapsedTime = (endTime - startTime) / 1_000_000.0;
        System.out.println("Elapsed time: " + elapsedTime + " ms");
         **/

    }
}
