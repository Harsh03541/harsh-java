public class Selection_sort {
    
    public static void selectionSort(int arr[], int size) {
        
        for(int i=0; i<size-1; i++) {

            int minINDEX = i;

            for(int j=i+1; j<size; j++) {

                if(arr[j] < arr[minINDEX]) 
                    minINDEX = j;                
            }
            int temp = arr[minINDEX];
            arr[minINDEX] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int data[] = {8,6,3,3,59,200};
        selectionSort(data, 6);

        for(int i=0; i<6; i++) {
            System.out.print(data[i] + "  ");
        }
    }

}
