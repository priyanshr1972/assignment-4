//You are given an N*N sudoku grid (N is a multiple of 3). Solve the sudoku and print the solution.
//        To learn more about sudoku, go to this link Sudoku-Wikipedia.
//
//        Input Format
//        First line contains a single integer N. Next N lines contains N integers each, where jth integer int ith line denotes the value at ith raw and jth calumn in sudoku grid. This value is 0, if the cell is empty.
//
//        Constraints
//        N=9 Solution exists for input matrix.
//
//        Output Format
//        Print N lines containing N integers each, where jth integer int ith line denotes the value at ith raw and jth calumn in sudoku grid, such that all cells are filled.
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
        int[][] boad = new int[n][n];
        for(int i=0;i<boad.length;i++){
            for(int j=0;j<boad[0].length;j++){
                boad[i][j] = sc.nextInt();
            }
        }
        sudokuSolver(boad, 0, 0);
    }
    private static void sudokuSolver(int[][] boad, int raw, int cal){
        if(cal==9){
            raw++;
            cal=0;
        }
        if(raw==9){
            print(boad);
            return;
        }
        if(boad[raw][cal]!=0){
            sudokuSolver(boad, raw, cal+1);
        }
        else{
            for(int val = 1;val<=9;val++){
                if(isSambhav(boad, raw, cal, val)){
                    boad[raw][cal] = val;
                    sudokuSolver(boad, raw, cal+1);
                    boad[raw][cal] = 0;
                }
            }
        }
    }
    private static boolean isSambhav(int[][] boad, int raw, int cal, int val){
        for(int c=0;c<9;c++){
            if(boad[raw][c]==val){
                return false;
            }
        }
        for(int r=0;r<9;r++){
            if(boad[r][cal]==val){
                return false;
            }
        }
        int r = raw-raw%3;
        int c = cal-cal%3;
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(boad[i][j]==val){
                    return false;
                }
            }
        }
        return true;
    }
    private static void print(int[][] boad){
        for(int i=0;i<boad.length;i++){
            for(int j=0;j<boad[0].length;j++){
                System.out.print(boad[i][j]+" ");
            }
            System.out.println();
        }
    }
}
