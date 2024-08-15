public class Selection_sort_using_recursion {
    
    public static void sorting(int arr[], int startIndex) {
        // base case
        if(startIndex >= arr.length-1) {
            return ;
        }

        int minIndex = startIndex;
        for(int i=startIndex + 1; i < arr.length; i++) {
            if(arr[i] < arr[minIndex]) {
                minIndex  = i;
            }
        }

            int temp = arr[minIndex];
            arr[minIndex] = arr[startIndex];
            arr[startIndex] = temp;
        
        // recursive call
        sorting(arr, startIndex+1);
    }

    public static void main(String[] args) {
        System.out.println("Program: Selection_sorting_using_recursion-");
        int data[] = {64, 34, 25, 12, 229, 11, 90};

        System.out.println("Unsorted data: ");
        for(int i =0; i<data.length; i++) {
            System.out.print(data[i] + "  ");
        }

        sorting(data, 0);

        System.err.println();
        System.out.println("Sorted data: ");
        for(int i =0; i<data.length; i++) {
            System.out.print(data[i] + "  ");
        }
    }
}
