package sorting;
import static sorting.InsertionSort.print;
public class ins {
    public static void main(String args[]){
     int[] arr= {34,67,23,14,47};
     sort(arr);
    }
    private static void sort(int[] arr){
        for(int index = 1 ;index < arr.length ; index++){
            int val = arr[index];
            int j = index - 1;
            while( j >= 0 && arr[j] > val){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = val;
        }
        print(arr);
    }

}
