package searching;

public class binary_desc {
    public static void main (String args[]){
        int[] arr={20,17,15,12,11,9,8,5,2};
        int val = 5;
        System.out.println(desc(arr,val));
    }
    private static int desc(int[] arr, int val){
        int low = 0;
        int high = arr.length - 1;
        while( low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == val){
                return mid;
            }
            else if(arr[mid] > val){
                low = mid+1;
            }
            else if(arr[mid] < val){
                high = mid - 1;
            }
        }
        return -1;
    }
}
