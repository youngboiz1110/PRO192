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
public class Part1 {
    public static void main(String[] args ){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.println("Enter number of cols: ");
        int cols = input.nextInt();
        int matrix[][];
        matrix = new int[rows][cols];
        System.out.println("Enter the matrix: ");
        for(int i =0;i<rows;i++){
            for(int j =0;i<cols;i++){
                System.out.print("\nm["+i+"]{"+j+"]");
                matrix[i][j]=input.nextInt();
            }
        }
        System.out.println("Matrix inputted:");
        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.format("%3d",matrix[i][j]);
            }
            System.out.println("\n");
        }
        int sum =0;
        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
            sum =sum + matrix[i][j];
        }
      }
        System.out.println("Sum:"+sum);
        System.out.println("Average:" +(float)sum/(rows*cols));
    }
}
    




