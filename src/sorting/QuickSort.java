package sorting;
import static sorting.InsertionSort.print;
public class QuickSort {
    public static void main(String args[]) {
        int[] arr = {3, 6, 7, 9, 2, 4};
        sort(arr , 0 , arr.length-1);
        print(arr);
    }
    private static void sort(int[] arr , int start , int end ){
        if(start < end){
            int random = finding(arr, start , end);
            sort(arr , start , random - 1);
            print(arr);
            sort(arr , random +1 , end);
            print(arr);
        }
    }
    private static int finding(int[] arr, int start , int end){
        int random = arr[start];
        int i = start - 1;
        for(int j = start ; j < end ; j++){
            if(arr[j] < random){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        return i + 1;
    }
}
