public class Search {
    public static <T extends Comparable<T>> int linearSearch(T[] array, T item) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public static <T extends Comparable<T>> int binarySearch(T[] array, T item) {
        return binarySearch(array, item, 0, array.length - 1);
    }


    public static <T extends Comparable<T>> int binarySearch(T[] array, T item, int lo, int hi) {
        if (hi >= lo) {
            int mid = lo + (hi - lo) / 2;
            if (array[mid].equals(item))
                return mid;

            if (array[mid].compareTo(item) > 0)
                return binarySearch(array, item, lo, mid - 1);
            return binarySearch(array, item, mid + 1, hi);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nlist = {0,1,2,3,4,5,6,7,8,9};
        
        double[] timingsLS = new double[nlist.length];

      
        double[] timingsBS = new double[nlist.length];

        long startTime, endTime;

        for (int i =0 ; i <nlist.length; i++) {
            int n = nlist[i];
            Integer[] arr = new Integer[n];
            for (int j = 0; j < n; j++) {
                arr[j] = j;
            }

            startTime = System.nanoTime();
            linearSearch(arr, n - 1);
            endTime = System.nanoTime();
            timingsLS[i] = (endTime - startTime) * 1e-9;

            startTime = System.nanoTime();
            binarySearch(arr, n - 1);
            endTime = System.nanoTime();
            timingsBS[i] = (endTime - startTime) * 1e-9;
        }

        int num_trials = 100;
        System.out.println("Timings for linear search");
        for (double time : timingsLS) {
            System.out.print("  " + String.format("%.8f", time) );
            System.out.println("\n");
        }

        System.out.println();
        
        System.out.println("Timings for binary search");
        for (double time : timingsBS) {
            System.out.print("  " + String.format("%.8f", time));
            System.out.println("\n");
        }
    }
}

