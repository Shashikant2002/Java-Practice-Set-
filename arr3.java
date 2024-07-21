public class arr3 {
    public static void main(String[] args) {
        float[] marks ={45.5f,2.5f,5.7f,7.5f};
        float sum =0;
        for(float element:marks){
            sum=sum+element;
        }
        System.out.println("The value of array is : " + sum / marks.length);
    }
    
}

//average
