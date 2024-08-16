public class Quick_sort {

    public static int partition(int arr[], int start, int end) {
        
        int pivot = arr[start];
        int count=0;
        
        for(int i=start+1; i<=end; i++) {
            if(arr[i] < pivot)
                count++;
        }
        int pivotIndex = start + count;

          //put pivot element at correct position
          int temp = pivot;
          arr[start] = arr[pivotIndex];
          arr[pivotIndex] = temp;

          int startIndex = start;
          int endIndex = end;   

          while (startIndex < pivotIndex && endIndex > pivotIndex) {
            while (startIndex < pivotIndex) {
                startIndex++;
            }
            while (endIndex > pivotIndex) {
                endIndex--;
            }
            if(startIndex < pivotIndex && endIndex > pivotIndex) { 
                temp = arr[startIndex];
                arr[startIndex] = arr[endIndex];
                arr[endIndex] = temp;

                startIndex++;
                endIndex--;
            }
          }
          return pivotIndex;
    }

    public static void quickSort(int arr[], int start, int end) {
        //base case
        if(start >= end) {
            return ;
        }
        int p = partition(arr, start, end);

        // left part sort:
        quickSort(arr, start, p-1);

        // right part sort:
        quickSort(arr, p+1, end);
        
    }
    public static void main(String[] args) {

        System.out.println("Program: Quick Sort-");

        int data[] = { 85, 2, 63, 95, 22, 532, 866, 1000, 526 };

        System.out.println("Unsorted data: ");

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "  ");
        }

        quickSort(data, 0, data.length - 1);

        System.err.println();
        System.out.println("Sorted data: ");

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "  ");
        }
    }
}
