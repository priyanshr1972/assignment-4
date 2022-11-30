//You are given an N*N sudoku grid (N is a multiple of 3). Solve the sudoku and print the solution.
//        To learn more about sudoku, go to this link Sudoku-Wikipedia.
//
//        Input Format
//        First line contains a single integer N. Next N lines contains N integers each, where jth integer int ith line denotes the value at ith row and jth column in sudoku grid. This value is 0, if the cell is empty.
//
//        Constraints
//        N=9 Solution exists for input matrix.
//
//        Output Format
//        Print N lines containing N integers each, where jth integer int ith line denotes the value at ith row and jth column in sudoku grid, such that all cells are filled.
//
//        Sample Input
//        9
//        5 3 0 0 7 0 0 0 0
//        6 0 0 1 9 5 0 0 0
//        0 9 8 0 0 0 0 6 0
//        8 0 0 0 6 0 0 0 3
//        4 0 0 8 0 3 0 0 1
//        7 0 0 0 2 0 0 0 6
//        0 6 0 0 0 0 2 8 0
//        0 0 0 4 1 9 0 0 5
//        0 0 0 0 8 0 0 7 9
//        Sample Output
//        5 3 4 6 7 8 9 1 2
//        6 7 2 1 9 5 3 4 8
//        1 9 8 3 4 2 5 6 7
//        8 5 9 7 6 1 4 2 3
//        4 2 6 8 5 3 7 9 1
//        7 1 3 9 2 4 8 5 6
//        9 6 1 5 3 7 2 8 4
//        2 8 7 4 1 9 6 3 5
//        3 4 5 2 8 6 1 7 9

        package Assignment4;

import java.util.Scanner;

public class SUDOKU_SOLVER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j] = sc.nextInt();
            }
        }
        sudokuSolver(board, 0, 0);
    }
    private static void sudokuSolver(int[][] board, int row, int col){
        if(col==9){
            row++;
            col=0;
        }
        if(row==9){
            display(board);
            return;
        }
        if(board[row][col]!=0){
            sudokuSolver(board, row, col+1);
        }
        else{
            for(int val = 1;val<=9;val++){
                if(isPossible(board, row, col, val)){
                    board[row][col] = val;
                    sudokuSolver(board, row, col+1);
                    board[row][col] = 0;
                }
            }
        }
    }
    private static boolean isPossible(int[][] board, int row, int col, int val){
        for(int c=0;c<9;c++){
            if(board[row][c]==val){
                return false;
            }
        }
        for(int r=0;r<9;r++){
            if(board[r][col]==val){
                return false;
            }
        }
        int r = row-row%3;
        int c = col-col%3;
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(board[i][j]==val){
                    return false;
                }
            }
        }
        return true;
    }
    private static void display(int[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
