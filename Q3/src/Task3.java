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
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String [] list = new String[10];
        System.out.println("Enter the list: ");
        for(int i =0;i <10;i++){
            list[i] = input.nextLine();
        }
        for(int i=0;i<10;i++){
            String s1 = list[i].toUpperCase();
            System.out.println(s1);
        }
    }
}
