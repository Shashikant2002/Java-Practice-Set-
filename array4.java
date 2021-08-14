public class array4 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = Math.floorDiv(arr.length,2);
        for(int i=0;i<n;i++){
           int Temp = arr[i];
           arr[i] = arr[arr.length-i-1];
           arr[arr.length-i-1] = Temp;
        }
        for(int element:arr){
            System.out.println(element);
        }

    }
    
}

//print reverce arry in java