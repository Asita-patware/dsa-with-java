public class A2_SelectionSort {

    // Utility method to print arrays
    public static void printArray(int arr[]){
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // --- Selection Sort (INCREASING) ---
    public static void selectionSort(int arr[]){

        System.out.print("\nSelection Sort - Original: ");
        printArray(arr);

        for(int i = 0; i < arr.length - 1; i++){
            int minIndex = i;

            for(int j = i + 1; j < arr.length; j++){
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }

            int temp1 = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp1;
        }

        System.out.print("Selection Sort - Sorted:   ");
        printArray(arr);
    }


    public static void main(String[] args){
        int arr[] = {5,4,1,3,2};
        selectionSort(arr);
    }

}
