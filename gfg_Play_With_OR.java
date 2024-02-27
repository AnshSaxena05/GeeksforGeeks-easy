public class gfg_Play_With_OR {
    public static int[] game_with_number (int arr[], int n) {
        for(int i=0;i<n-1;i++){
            arr[i]= arr[i] | arr[i+1];
        }
        return arr;
    }
    public static void main(String[] args) {
        // Example usage
        int[] inputArray = {1, 2, 3, 4, 5};
        int n = inputArray.length;

        System.out.println("Original array:");
        printArray(inputArray);

        int[] resultArray = gfg_Play_With_OR.game_with_number(inputArray, n);

        System.out.println("Array after applying game_with_number:");
        printArray(resultArray);
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
