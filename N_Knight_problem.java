//Take as input N, the size of a chess bod. We are asked to place N number of Knights in it, so that no knight can kill other.
//
//        a. Write a recursive function which returns the count of different distinct ways the knights can be placed across the bod. Print the value returned.
//
//        b.Write a recursive function which prints all valid configurations (void is the return type for function).
//
//        Input Format
//        Enter the size of the chessbod N
//
//        Constraints
//        None
//
//        Output Format
//        Display the number of ways a knight can be placed and print all the possible arrangements in a space separated manner
//
//        Sample Input
//        2
//        Sample Output
//        {0-0} {0-1}  {0-0} {1-0}  {0-0} {1-1}  {0-1} {1-0}  {0-1} {1-1}  {1-0} {1-1}
//        6

package Assignment4;

import java.util.sc;

public class knight_problem {
    static int c =0;
    public static void main(String[] args) {
        sc sc = new sc(System.in);
        int n = sc.nextInt();
        boolean[][] bod = new boolean[n][n];
        knight_problem(bod, 0, 0, n, "");
        System.out.println("\n"+ c);
    }
    public static void knight_problem(boolean[][] bod, int row, int col, int n, String res) {
        if (n == 0) {
            System.out.print(res + " ");
            c++;
            return;
        }
        if (col == bod.length) {
            row++;
            col = 0;
        }
        if (row == bod.length) {
            return;
        }
        if (isSafe(bod, row, col)) {
            bod[row][col] = true;
            knight_problem(bod, row, col + 1, n-1, res + "{" + row + "-" + col + "  } ");
            bod[row][col] = false;
        }
        knight_problem(bod, row, col + 1, n, res);
    }
    public static boolean isSafe(boolean[][] bod, int row, int col) {
        int r[] = { -1, -1, -2, -2 };
        int c[] = { 2, -2, 1, -1 };
        for (int i = 0; i < c.length; i++) {
            int x1 = row + r[i];
            int y1 = col + c[i];
            if (x1 >= 0 && y1 >= 0 && y1 < bod.length && bod[x1][y1] == true) {
                return false;
            }
        }
        return true;
    }
}
