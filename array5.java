public class array5 {
    public static void main(String[] args) {
        int [] arr = {1,21,3,445,5,34,67};
        int max = 0;
        for(int e:arr){
            if(e>max){
                max=e;
            }
        }
        System.out.println("max element is " + max);
    }
    
}

//find a max number
