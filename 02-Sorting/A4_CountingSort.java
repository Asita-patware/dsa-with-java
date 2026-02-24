public class A4_CountingSort {
    
    // Utility method to print arrays
    public static void printArray(int arr[]){
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // --- Counting Sort (INCREASING) ---
    public static void countingSort(int arr[]){
        
        System.out.print("\nCounting Sort - Original: ");
        printArray(arr);

        // 1. Find largest element
        int larger = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            larger = Math.max(larger, arr[i]);
        }

        // 2. Create count array
        int count[] = new int[larger + 1];

        // 3. Store frequency
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }

        // 4. Sorting
        int j = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        System.out.print("Counting Sort - Sorted:   ");
        printArray(arr);

    }


    public static void main(String[] args){
        int arr[] = {5,4,1,3,2};
        countingSort(arr);

    }

}


    