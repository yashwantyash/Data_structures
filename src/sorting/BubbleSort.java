package sorting;

public class BubbleSort {
    public static void main(String args[]){
        int[] arr = {5,2,1,6,4};
        //BubbleSort bs = new BubbleSort();
        sort(arr);
        //bs.print(arr);
    }
    private static void sort(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){ // O(n) times
            for(int j = i+1 ; j < arr.length ; j++){ //O(n) times
                if( arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            print(arr);
        }

    }
    private static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}

// Time complexity
//      best = O(n)   if all the elements are in order and no need of sorting
//      worst = O(n^2)