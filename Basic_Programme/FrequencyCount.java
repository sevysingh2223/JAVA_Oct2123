public class FrequencyCount {
    public static void main(String[] args) {
        int arr[] = {8,5,6,9,8,5,6,8,1};
        for(int i=0;i<arr.length;i++){
            int count =1;
            if(arr[i] == -1){
                    continue;
                }
            for(int j =0;j<arr.length;j++){
                if(i!=j && arr[i]==arr[j]){
                    count++;
                    arr[j] = -1;
                }
            }
            System.out.println("Count of " + arr[i] + " : " + count);
        }

    }
}
