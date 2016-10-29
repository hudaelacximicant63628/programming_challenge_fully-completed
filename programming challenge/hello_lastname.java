import java.util.Scanner;

public class hello_lastname{
    public static void main(String[] args){
    
     Scanner sc = new Scanner(System.in);
      
     System.out.println("Enter your full name: ");
     String name = sc.nextLine();
     String last_name = "";
     
     for(int x = 0; x < name.length(); x++){
        if(name.substring(x, x+1).equals(" ")){
        last_name = name.substring(x);
        }
        
        
     }
     System.out.println("Hello, " + last_name.trim() );  
      }
}