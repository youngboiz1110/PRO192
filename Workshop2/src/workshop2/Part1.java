
package workshop2;


import java.util.Scanner;
public class Part1 {
    public  static void main (String[] args){
 
        boolean cont=false;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the number:");
                int num = input.nextInt();
                if (num<1)
                    throw new Exception();
                System.out.println("The number is "+num);
                    cont = false ;
              
            }catch (Exception e){
                System.out.println("The number is invalid");
                    cont = true;
                }
            }while (cont);
        }
    }
