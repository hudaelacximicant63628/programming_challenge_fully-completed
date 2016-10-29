import java.util.Scanner;

public class fullname_initials{
    public static void main(String[] args){
    
         Scanner sc = new Scanner(System.in);
          
         System.out.println("Enter your full name (first, middle and last name): ");
         String name = sc.nextLine();
         
         String first_initial = "";
         String second_initial = "";
         String third_initial = "";
         
         int first_space_index = name.indexOf(" ");
         int last_space_index = name.lastIndexOf(" ");
         
         first_initial = name.substring(0,1);
         second_initial = name.substring((first_space_index)+1,(first_space_index)+2);
         third_initial = name.substring((last_space_index)+1, (last_space_index)+2);
         
         System.out.println((first_initial + " " + second_initial + " " + third_initial).toUpperCase());
         
         
       
         
         
   
        
     }
       
      }  
