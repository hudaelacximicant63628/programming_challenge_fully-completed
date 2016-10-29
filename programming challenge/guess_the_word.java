import java.util.Scanner;
public class guess_the_word
{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
        
            String random = "RANDOM";
            
            String r;
            System.out.println("Try and guess my 6 letter word: ");
            String attempt = sc.nextLine();
            attempt = attempt.toUpperCase();
      
            if(attempt.charAt(4) != ('O')){ 
             attempt = attempt.replace(attempt.charAt(4), '?');
            }
            if(attempt.charAt(0) != ('R')){
             attempt = attempt.replace(attempt.charAt(0), '?');
            }
            if(attempt.charAt(2) != ('N')){
             attempt = attempt.replace(attempt.charAt(2), '?');
            }
            if(attempt.charAt(1) != ('A')){
             attempt = attempt.replace(attempt.charAt(1), '?');
            }
            if(attempt.charAt(3) != ('D')){
             attempt = attempt.replace(attempt.charAt(3), '?');
            }
            if(attempt.charAt(5) != ('M')){
             attempt = attempt.replace(attempt.charAt(5), '?');
        
            }
            System.out.println(attempt);
        }
        }
    

        