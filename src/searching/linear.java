package searching;

public class linear {
    public static void main(String args[]){
        int[] arr = {2,3,5,6,7};
        int val = 6;
        System.out.println(searching(arr,val));
    }
    private static int searching(int[] arr , int val){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == val){
                return i;
            }
        }
        return -1;
    }
}

// time complexity
//  best case = O(1)  bcoz if element is found at first case then complexity is 1
//  worst case = O(n)   bcoz if element is found a =t last position in an array then complexity n
//          where n is array length
