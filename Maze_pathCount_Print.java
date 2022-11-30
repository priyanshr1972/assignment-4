//Take as input N1 and N2, both numbers. N1 and N2 is the number of rows and columns on a rectangular board. Our player starts in top-left corner of the board and must reach bottom-right corner. In one move the player can move 1 step horizontally (right) or 1 step vertically (down).
//
//        a. Write a recursive function which returns the count of different ways the player can travel across the board. Print the value returned.
//
//        b. Write a recursive function which returns an ArrayList of moves for all valid paths across the board. Print the value returned.
//
//        e.g. for a board of size 3,3; a few valid paths will be “HHVV”, “VVHH”, “VHHV” etc. c. Write a recursive function which prints moves for all valid paths across the board (void is the return type for function).
//
//        Input Format
//        Enter the number of rows N and columns M
//
//        Constraints
//        None
//
//        Output Format
//        Display the total number of paths and display all the possible paths in a space separated manner
//
//        Sample Input
//        3
//        3
//        Sample Output
//        VVHH VHVH VHHV HVVH HVHV HHVV
//        6

package Assignment4;

import java.util.Scanner;

public class Maze_pathCount_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        mazePathDPrint(0,0, row-1, col-1,"");
        System.out.println("\n"+mazePathDCount(0,0,row-1, col-1));
    }
    private static void mazePathDPrint(int rows, int cols, int rowe, int cole, String res){
        if(rows==rowe && cols==cole){
            System.out.print(res+" ");
            return;
        }
        if(rows>rowe || cols>cole){
            return;
        }
        mazePathDPrint(rows+1, cols, rowe, cole, res+"V");
        mazePathDPrint(rows, cols+1, rowe, cole, res+"H");
    }
    private static int mazePathDCount(int rows, int cols, int rowe, int cole){
        if(rows==rowe && cols==cole){
            return 1;
        }
        if(rows>rowe || cols>cole){
            return 0;
        }
        int count = 0;
        count+=mazePathDCount(rows, cols+1, rowe, cole);
        count+=mazePathDCount(rows+1, cols, rowe, cole);
        return count;
    }
}
