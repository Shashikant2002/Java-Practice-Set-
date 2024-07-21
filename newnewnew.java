import java.util.Random;
import java.util.Scanner;


class game4886{
    public int inputnumber;
    public int number;
    public int numberofgusses = 0;

    public int getnumberofgusses(){
        return numberofgusses;
    }
    public void setnumberofgusses(int numberofgusses){
        this.numberofgusses = numberofgusses;
    }
    game4886(){
        Random rand = new Random();
        this.number = rand.nextInt(3);
    }
    void takeinputfunction(){
        System.out.println("Guss the Number: ");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
    }
    
    boolean iscorrectnumber(){
        numberofgusses++;
        if(inputnumber == number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, numberofgusses);
            return true;
        } 
        else if(inputnumber < number){
            System.out.println("To lowwwwwwwwwww.......................");
        }
        else if(inputnumber > number){
            System.out.println("To hieeeeeeeeeee.......................");
        }
        return false;
        
    }

}

public class newnewnew {
    public static void main(String[] args) {
        boolean b = false;
        while(!b){
            game4886 g = new game4886();
            g.takeinputfunction();
            b = g.iscorrectnumber();
            System.out.println(b);
        }
    }
    
}