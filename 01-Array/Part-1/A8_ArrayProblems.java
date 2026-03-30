public class A7_ArrayProblems  {

    //1
    public static int findSecondLargest(int[] arr){
        if (arr.length < 2) {
            return -1;
        }
        int secondLargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if (largest < arr[i]) {
                secondLargest = largest;
                largest = arr[i];
            }else if (largest != arr[i] && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest ;
    }

    //2
    public static boolean isSorted(int arr[]){
        if (arr.length <= 1) {
            return true;
        }
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                isDecreasing = false;
            } else if (arr[i] > arr[i + 1]) {
                isIncreasing = false;
            }
        }

        return isIncreasing || isDecreasing;
    }

        

    // 3. Move zeros to end
    public static void moveZerosToEnd(int[] arr) {
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
    }

    
     // 4. Count frequency
     public static void printFrequency(int[] arr) {
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " -> " + count);
        }
    }


    // 5. Find missing number (1 to n)
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for(int i=0; i<arr.length; i++){
            actualSum += arr[i];
        }
        return expectedSum - actualSum;
    }

     public static void main(String[] args) {

        int[] arr1 = {2, 4, 20, 21, 53};
        System.out.println("Second Largest: " + findSecondLargest(arr1));

        int[] arr2 = {1, 3};
        System.out.println("Is Sorted: " + isSorted(arr2));

        int[] arr3 = {12, 3, 0, 4, 0, 31, 0};
        moveZerosToEnd(arr3);
        System.out.print("After moving zeros: ");
        for (int num : arr3) System.out.print(num + " ");
        System.out.println();

        int[] arr4 = {1, 2, 1, 3, 2};
        System.out.println("Frequency:");
        printFrequency(arr4);

        int[] arr5 = {1, 2, 4, 5};
        System.out.println("Missing Number: " + findMissingNumber(arr5));
    }
}

