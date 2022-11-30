//Take as input N, the size of a chess bod. We are asked to place N number of queens in it, so that no queen can kill other.
//
//        a. Write a recursive function which returns the count of different distinct ways the queens can be placed across the bod. Print the value returned.
//
//        b. Write a recursive function which prints all valid configurations (void is the return type for function).
//
//        Input Format
//        Enter the number N(Size of the chessbod)
//
//        Constraints
//        None
//
//        Output Format
//        Display the number of possible ways of arranging N queens and print all the possible arrangements in a space separated manner
//
//        Sample Input
//        4
//        Sample Output
//        {1-2} {2-4} {3-1} {4-3}  {1-3} {2-1} {3-4} {4-2}
//        2

package Assignment4;

import java.util.Scanner;

public class N_Queen_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] bod = new boolean[n][n];
        System.out.println("\n"+fPosition(bod, n, 0));
    }
    private static int fPosition(boolean[][] bod, int n, int row){
        if(n==0){
            Print(bod);
            return 1;
        }
        int count = 0;
        for(int col=0;col<bod[0].length;col++){
            if(isSafe(bod, row, col)){
                bod[row][col] = true;
                count+=fPosition(bod, n-1, row+1);
                bod[row][col] = false;
            }
        }
        return count;
    }
    private static boolean isSafe(boolean[][] bod, int row, int col){
        int r = row;
        while (r>=0){
            if(bod[r][col]==true){
                return false;
            }
            r--;
        }
        r = row;
        int c = col;
        while (r>=0 && c>=0){
            if(bod[r][c]==true){
                return false;
            }
            r--;
            c--;
        }
        r = row;
        c = col;
        while (r>=0 && c<bod.length){
            if(bod[r][c] == true){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
    private static void Print(boolean[][] bod){
        for(int i=0;i<bod.length;i++){
            for(int j=0;j<bod[0].length;j++){
                if(bod[i][j] == true){
                    System.out.print("{"+(i+1)+"-"+(j+1)+"} ");
                }
            }
        }
        System.out.print(" ");
    }
}
