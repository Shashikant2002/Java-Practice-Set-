public class array2 {
    public static void main(String[] args) {
        int[] marks = {45,4,9,5,10};
        int num = 45;
        boolean isInArray = false;
        for(float element:marks){
            if(num==element){
                isInArray=true;
            }
        }
        if(isInArray){
            System.out.println("Present in the Array");
        }
        else{
            System.out.println("Not in array");
        }
    }
    
}
// number is in array or Not
