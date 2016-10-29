import java.util.Scanner;

public class Vowels_consonants{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            
        System.out.println('\n' + "Enter a word: ");
        String word = sc.nextLine();
        
        while(word.isEmpty()){
            System.out.println("Enter a word: ");
            word = sc.nextLine();
        }
        String upperCase_word = word.toUpperCase();
        int word_length = word.length();
        int count = 0;
        int consonants = 0;
       
            for(int y = 0; y < word_length; y++){
            if(upperCase_word.charAt(y) == ('A')){
            count += 1;
            }else if(upperCase_word.charAt(y) == ('E')){
            count += 1;
            }else if(upperCase_word.charAt(y) == ('I')){
            count += 1;
            }else if(upperCase_word.charAt(y) == ('O')){
            count += 1;
            }else if(upperCase_word.charAt(y) == ('U')){
            count += 1;
            }
            consonants = (word_length) - count;
        }
        System.out.print("Number of consonants: " + consonants);
        System.out.print('\n' + "Number of vowels: " + count);
    }
}