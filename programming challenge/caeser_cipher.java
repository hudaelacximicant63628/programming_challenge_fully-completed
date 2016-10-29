import java.util.Scanner;
public class caeser_cipher{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            
            String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String shifted = " ";
            
            System.out.println("Enter the amount of spaces you want to shift: ");
            int shift = sc.nextInt();
            
            int endIndex = alphabet.length()-shift;
            
            String last_letters = alphabet.substring(endIndex);
            alphabet = alphabet.substring(0, endIndex);
            alphabet = last_letters + alphabet;
            
            System.out.println(alphabet);
            
            // after 28 shifts it will not work because it is the same as saying 0 shifts
            // so to work out what 35 shifts would be you would find the different between 35 and 28
            
        }
            
        }
    

       