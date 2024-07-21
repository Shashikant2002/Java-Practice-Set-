public class array6 {
    public static void main(String[] args) {
        int [] arr={1,21,3,-445,5,34,6};
        int min = Integer.MAX_VALUE;
        for(int e:arr){
            if(e<min){
                min=e;
            }
        }
        System.out.println("min is " + min);
    }
    
}

//find a min number