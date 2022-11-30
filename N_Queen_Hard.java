//You are given an empty chess board of size N*N. Find the number of ways to place N queens on the board, such that no two queens can kill each other in one move. A queen can move vertically, horizontally and diagonally.
//
//        Input Format
//        A single integer N, denoting the size of chess board.
//
//        Constraints
//        1 ≤ N < 15
//
//        Output Format
//        A single integer denoting the count of solutions.
//
//        Sample Input
//        4
//        Sample Output
//        2

package Assignment4;

import java.util.Scanner;

public class N_Queen_Hard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] board = new boolean[n][n];
        System.out.println(findPosition(board, n, 0));
    }
    private static int findPosition(boolean[][] board, int n, int row){
        if(n==0){
            return 1;
        }
        int count = 0;
        for(int col=0;col<board[0].length;col++){
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count+=findPosition(board, n-1, row+1);
                board[row][col] = false;
            }
        }
        return count;
    }
    private static boolean isSafe(boolean[][] board, int row, int col){
        int r = row;
        while (r>=0){
            if(board[r][col]==true){
                return false;
            }
            r--;
        }
        r = row;
        int c = col;
        while (r>=0 && c>=0){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c--;
        }
        r = row;
        c = col;
        while (r>=0 && c<board.length){
            if(board[r][c] == true){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
}
