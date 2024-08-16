public class Merge_sort {

    public static void merge(int arr[], int start, int end) {

        int mid = start + (end - start) / 2;

        int len1 = mid - start + 1;
        int len2 = end - mid;

        int[] first = new int[len1];
        int[] second = new int[len2];

        int mainArrayIndex = start;
        for (int i = 0; i < len1; i++) {
            first[i] = arr[mainArrayIndex++];
        }

        for (int i = 0; i < len2; i++) {
            second[i] = arr[mainArrayIndex++];
        }

        // merge 2 sorted array:
        int index1 = 0;
        int index2 = 0;

        mainArrayIndex = start;

        while (index1 < len1 && index2 < len2) {

            if (first[index1] < second[index2]) {
                arr[mainArrayIndex++] = first[index1++];
            } else {
                arr[mainArrayIndex++] = second[index2++];
            }
        }
        while (index1 < len1) {
            arr[mainArrayIndex++] = first[index1++];
        }
        while (index2 < len2) {
            arr[mainArrayIndex++] = second[index2++];
        }

    }

    public static void mergeSort(int arr[], int start, int end) {

        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;

        // left part sort:
        mergeSort(arr, start, mid);

        // right part sort:
        mergeSort(arr, mid + 1, end);

        // merging array:
        merge(arr, start, end);
    }

    public static void main(String[] args) {

        System.out.println("Program: Merge Sort-");

        int data[] = { 85, 2, 63, 95, 22, 532, 866, 1000, 526 };

        System.out.println("Unsorted data: ");

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "  ");
        }

        mergeSort(data, 0, data.length - 1);

        System.err.println();
        System.out.println("Sorted data: ");

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "  ");
        }
    }
}
