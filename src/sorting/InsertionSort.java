package sorting;

public class InsertionSort {
    public static void main(String argd[]){
        int[] arr= {5,2,1,6,4} ;
        sort(arr) ;
    }
    private static void sort(int arr[])
    {
        for ( int i = 1 ; i < arr.length ; i++ )
        {
            int key = arr[i] ;
            int j = i - 1 ;
            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j] ;
                j = j - 1 ;
            }
            arr[j + 1] = key ;
            print(arr) ;
        }
    }
    public static void print(int[] arr) {
        for(int ele : arr) {
            System.out.print(ele + " ") ;
        }
        System.out.println() ;
    }
}
//Time complexity
//      best = O(n)
//      worst = O(n^2)