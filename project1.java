

public class project1 {
    public static void main(String[] args) {
        System.out.println("Shashikant");
        int [] marks = {20, 21, 22,23};
        for(int i=0; i<marks.length;i++){
            System.out.println(marks[i]);
        }

        for( int element: marks){
            System.out.println("\n"+element);
        }
    }
    
}
