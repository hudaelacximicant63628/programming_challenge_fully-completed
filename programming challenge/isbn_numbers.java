import java.util.Scanner;
public class isbn_numbers
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    
        String ISBN = "";
        int[] anArray;
        anArray = new int[100];
    
        do{
            System.out.println("Enter a 13 digit ISBN number: ");
            ISBN = input.nextLine();
            ISBN = ISBN.replace("-", "");
        }while(ISBN.length() != (13));
        
        String strIx1 = ISBN.substring(0, 1);
        String strIx2 = ISBN.substring(1, 2);
        String strIx3 = ISBN.substring(2, 3);
        String strIx4 = ISBN.substring(3, 4);
        String strIx5 = ISBN.substring(4, 5);
        String strIx6 = ISBN.substring(5, 6);
        String strIx7 = ISBN.substring(6, 7);
        String strIx8 = ISBN.substring(7, 8);
        String strIx9 = ISBN.substring(8, 9);
        String strIx10 = ISBN.substring(9, 10);
        String strIx11 = ISBN.substring(10, 11);
        String strIx12 = ISBN.substring(11,12);
   
        int ix1 = Integer.parseInt(strIx1);
        int ix3 = Integer.parseInt(strIx3);
        int ix5 = Integer.parseInt(strIx5);
        int ix7 = Integer.parseInt(strIx7);
        int ix9 = Integer.parseInt(strIx9);
        int ix11 = Integer.parseInt(strIx11);
        int ix2 = Integer.parseInt(strIx2);
        int ix4 = Integer.parseInt(strIx4);
        int ix6 = Integer.parseInt(strIx6);
        int ix8 = Integer.parseInt(strIx8);
        int ix10 = Integer.parseInt(strIx10);
        int ix12 = Integer.parseInt(strIx12);
       
        ix2 *= 3;
        ix4 *= 3;
        ix6 *= 3;
        ix8 *= 3;
        ix10 *= 3;
        ix12 *= 3;
        
        int sum = (ix1+ix2+ix3+ix4+ix5+ix6+ix7+ix8+ix9+ix10+ix11+ix12);
        int quotient = ((ix1+ix2+ix3+ix4+ix5+ix6+ix7+ix8+ix9+ix10+ix11+ix12)/10);
        
        if(((sum+quotient) % 10) == 0){
            System.out.println("ISBN is valid");
        }else{
            System.out.println("ISBN is not valid");
        }
       
       

       }
}
