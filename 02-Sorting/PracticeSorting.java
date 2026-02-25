public class PracticeSorting {

    static void printArray(int arr[]){
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Bubble Sort (Decreasing)
    public static void bubbleSortDescending(int arr[]){
        for(int turn = 0; turn < arr.length - 1; turn++){
            for(int j = 0; j < arr.length - 1 - turn; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Selection Sort (Decreasing)
    public static void selectionSortDescending(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            int maxIndex = i;

            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    // Insertion Sort (Decreasing)
    public static void insertionSortDescending(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int current = arr[i];
            int prev = i - 1;

            while(prev >= 0 && arr[prev] < current){
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = current;
        }
    }

    // Counting Sort (Decreasing)
    public static void countingSortDescending(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int x : arr){
            largest = Math.max(largest, x);
        }

        int count[] = new int[largest + 1];

        for(int x : arr){
            count[x]++;
        }

        int index = 0;
        for(int i = count.length - 1; i >= 0; i--){
            while(count[i] > 0){
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args){
        int arr[] = {3,6,2,1,8,7,4,5};

        bubbleSortDescending(arr);
        printArray(arr);

        selectionSortDescending(arr);
        printArray(arr);

        insertionSortDescending(arr);
        printArray(arr);

        countingSortDescending(arr);
        printArray(arr);
    }
}

