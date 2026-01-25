import java.util.Scanner;

public class basic{
    public static void main(String []args){
        System.out.println("Enter a word: ");
        
        Scanner input = new Scanner(System.in);
        String word = input.next();

        System.out.println("Entered word is:  " + word);
    }
}