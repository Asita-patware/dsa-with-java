public class A1_BubbleSort{

    // Utility method to print arrays
        public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Increasing Order
    public static void bubbleSort(int arr[]){
        for(int turn = 0; turn < arr.length - 1; turn++){
            boolean swapped = false;

            for(int j = 0; j < arr.length - 1 - turn; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }

    public static void main(String[] args){
        int arr[] = {5,4,1,3,2};
        bubbleSort(arr);
        printArray(arr);
    }
}

