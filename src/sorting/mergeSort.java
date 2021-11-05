package sorting;
import static sorting.InsertionSort.print;
public class mergeSort {
    public static void main(String args[]) {
        int[] arr = {5,3,4,1,2};
        sort(arr,0,arr.length-1);
        print(arr);
    }
    private static void sort(int[] arr,int start , int end) {
        int mid;
        if(start < end){
            mid = ( start + end ) / 2;
            sort( arr , start , mid );
            sort( arr , mid+1 , end);
            merging( arr,start,mid,end );
        }
    }
    private static void merging(int[] arr, int start , int mid , int end){
        int n1 = mid - start + 1 ;
        int n2 = end - mid ;
        int a[] = new int[n1];
        int b[] = new int[n2];
        for(int i = 0 ; i < n1 ; i++){
            a[i] = arr[start + i];
        }
        for(int j = 0 ; j < n2 ; j++){
            b[j] = arr[mid + 1 + j];
        }
        int i = 0 ;
        int j = 0 ;
        int temp = start ;
        while(i < n1 && j < n2){
            if (a[i] < b[j]){
                arr[temp] = a[i];
                temp++;
                i++;
            }
            else {
                arr[temp] = b[j];
                temp++;
                j++ ;
            }
        }
        // if the pointer ends either i or j then we need to traverse
//        while(i < n1){
//
//            temp++ ;
//            i++;
//        }
//        while(j < n2){
//            temp++ ;
//            j++;
//        }
    }
}
//Time complexity
//      best = O(n)
//      worst = O(n logn)