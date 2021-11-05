package sorting;
import static sorting.InsertionSort.print;
public class SelectionSort {
    public static void main(String args[]){
        int[] arr= {5,2,1,6,4};
        sort(arr);
    }
    private static void sort(int[] arr){
        for(int i = 0 ; i < arr.length-1 ; i++){
            int min = i;
            for(int j = i+1 ; j <arr.length ; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            print(arr);
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}

//Time complexity
//      best = O(n)
//      worst = O(n^2)