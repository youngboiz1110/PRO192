/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the number 1: ");
           float n1 = input.nextFloat();
       System.out.println("Enter the number 2: ");
           float n2 = input.nextFloat();
       System.out.println("Enter the operator(+-*/):");
       char op = input.next().charAt(0);
       double result =0;
       switch(op){
           case '+':
               result = n1+n2; 
               break;
           case '-':
               result = n1-n2;
               break;
           case '*':
               result = n1*n2;
               break;
           case'/':
               if(n2!=0){
               result=n1/n2;}
               else{
                   System.out.println("Error");
               }
               break;
           default:
               System.out.println("Erorr");
               
       
       }
       System.out.println(result);
    }
}
    

