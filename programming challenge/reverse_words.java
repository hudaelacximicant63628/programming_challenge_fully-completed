import java.util.Scanner;

public class reverse_words{
        public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);   
        
        String reverse = " ";
        System.out.println("Type in a saying: ");
        
        String saying = sc.nextLine();
        
        while(saying.isEmpty()){
        System.out.println("Type in a saying: ");
        saying = sc.nextLine();
        }
       
        int saying_length = saying.length();
        
        for(int x = saying_length - 1; x >= 0; x--){
        reverse += saying.charAt(x);
        
        }
        System.out.println(reverse);
    }
}