public class A3_InsertionSort {

    // Utility method to print arrays
    public static void printArray(int arr[]){
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }

     // --- Insertion Sort (INCREASING) ---
    public static void insertionSort(int arr[]){
        
        System.out.print("\nInsertion Sort - Original: ");
        printArray(arr);

        for(int i = 1; i < arr.length; i++){
            int current = arr[i];
            int prev = i - 1;

            while (prev >=0 && arr[prev] > current) { // increasing order
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = current;
        }

        System.out.print("Insertion Sort - Sorted:   ");
        printArray(arr);
    }

    public static void main(String[] args){
        int arr[] = {5,4,1,3,2};
        insertionSort(arr);
    }
}

