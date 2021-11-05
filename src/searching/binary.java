package searching;

public class binary {
    public static void main(String args[]){
        int[] arr = {2,3,4,5,7,8,9,10,12};
        int val = 12;
        System.out.println(binary(arr,val));
    }
    private static int binary(int[] arr , int val){
        int low = 0;
        int high = arr.length -1 ;
        while(low <= high) {
            int mid = (low+high)/2 ;
            if (arr[mid] == val) {
                return mid;
            }
            else if(arr[mid] > val){
                high = mid - 1 ;
            }
            else if(arr[mid] < val){
                low = mid + 1;
            }
        }
        return -1;
    }
}

// time complexity
//  best = O(1)  if val is found at mid then its best case
//  worst = O(log n)
//      start value = n
//      next value = n/2,n/4,n/8,......1
//      n/2^0 , n/2^1 , n/2^2 , n/2^3 ,.......,n/2^i
//          2^i = n by using log2 on both sides
//          log 2^i = log n
//              i = log n