import java.util.Scanner;
public class palindrome{
   
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a word: ");
        String word = input.nextLine();
        String word1 = " ";
        
        for(int x = word.length() - 1; x >= 0; x--){
            word1 += word.charAt(x);
            
        }
        word1 = word1.trim();
        
        if(word1.equals(word)){
        System.out.println("That IS a palindrome word!");
        }else{
        System.out.println("That is NOT a palindrome word");
        }
        
    }
} 