public class ReverseArray {
    public static void main(String[] args) {
        int arr[] ={5,8,6,9,7};
        int n = arr.length;
        int m = n-1;
        for(int i=0;i<n/2;i++,m--){
            int temp = arr[i];
            arr[i] = arr[m];
            arr[m] =temp;
        }

        System.out.println("REVERSED ARRAY IS ");
        for (int i : arr) {
            System.out.print(i + "  ");
        }
    }
}


// Rotate By One
// Leader Element : Element which doesn't have greater element to its right
// Majority Element : that appears more than n/2 times
// Count of next greater elements
// Count of next smaller elements
// Count of previous greater elements
// Count of previous smaller elements
