//You are given an N*M grid. Each cell (i,j) in the grid is either blocked, or empty. The rat can move from position (i,j), down or right on the grid.
//        Initially rat is on the position (1,1). It wants to reach position (N,M). Find the rightmost path through which, rat can reach this position. A path is rightmost, if the rat is at position (i,j), it will always move to (i,j+1), if there exists a path from (i,j+1) to (N,M).
//
//        Input Format
//        First line contains 2 integers, N and M, denoting the rows and columns in the grid. Next N line contains. M characters each. An 'X' in position (i,j) denotes that the cell is blocked and ans 'O' denotes that the cell is empty.
//
//        Constraints
//        1<=N,M<=1000 GRID(i,j)='X' or 'O'
//
//        Output Format
//        If a solution exists: Print N lines, containing M integers each. A 1 at a position (i,j) denotes that the (i,j)th cell is covered in the path and a 0 denotes that the cell is not covered in the path.
//        If solution doesn't exist, just print "-1".
//
//        Sample Input
//        5 4
//        OXOO
//        OOOX
//        OOXO
//        XOOO
//        XXOO
//        Sample Output
//        1 0 0 0
//        1 1 0 0
//        0 1 0 0
//        0 1 1 1
//        0 0 0 1

        package Assignment4;

import java.util.Scanner;

public class Rat_in_a_maze {
    static boolean f = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] board = new char[n][m];
        for (int i = 0; i < board.length; i++) {
            String temp = sc.next();
            for (int j = 0; j < temp.length(); j++) {
                board[i][j] = temp.charAt(j);

            }
        }
        int[][] res = new int[n][m];
        findPath(board, res, 0, 0);
        if(f==false){
            System.out.println(-1);
        }
    }
    public static void findPath(char[][] board, int[][] res, int row, int col) {
        if(f==true){
            return;
        }
        if (row == board.length - 1 && col == board[0].length - 1) {
            if (board[row][col] != 'X') {
                res[row][col] = 1;
                printAnswer(res);
                f = true;
            }
            return;
        }
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] == 'X') {
            return;
        }
        board[row][col] = 'X';
        res[row][col] = 1;
        findPath(board, res, row, col + 1);
		findPath(board, res, row + 1, col);
        board[row][col] = 'O';
        res[row][col] = 0;
    }
    public static void printAnswer(int[][] res) {
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
