import java.util.Scanner;
 public class word_count{
            public static void main(String[] args){
                   
            Scanner sc = new Scanner (System.in);
            int count = 0;
            int y = 0;
            System.out.println("Enter a saying: ");
            String saying = sc.nextLine();
            
            while(saying.isEmpty()){
                System.out.println("Enter a saying: ");
                saying = sc.nextLine();
            }
 
            for(int x = 0; x < saying.length(); x++){
               if(saying.isEmpty()){
                count = 0;
                }else{y = 1;}
               if((saying.substring(x, x+1)).equals(" ")){
                        count +=1;
                    
               }
            }
            
            System.out.println(count+y);
            
            
        }
}
  