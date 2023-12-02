package Recursion;

public class IsSorted {

    static boolean isSort(int arr[] ,int index){
        if(index == arr.length-1){
            return true;
        }

        if(arr[index] > arr[index+1]){
            return false;
        }
        return isSort(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,3};
        System.out.println(isSort(arr, 0));
    }
}
