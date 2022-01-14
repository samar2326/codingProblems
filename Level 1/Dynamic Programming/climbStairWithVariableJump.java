/*
1. You are given a number n, representing the number of stairs in a staircase.
2. You are on the 0th step and are required to climb to the top.
3. You are given n numbers, where ith element's value represents - till how far from the step you
     could jump to in a single move.
     You can of course jump fewer number of steps in the move.
4. You are required to print the number of different paths via which you can climb to the top.

Constraints
0 <= n <= 20
0 <= n1, n2, .. <= 20

Format
Input
A number n
.. n more elements

Output
A number representing the number of ways to climb the stairs from 0 to top.

Example
Sample Input

10
3
3
0
2
1
2
4
2
0
0

Sample Output
5
 */
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int[] jumps=new int[n];
        for (int i = 0; i < jumps.length; i++) {
            jumps[i]= scn.nextInt();
        }

        System.out.println(climbStairVariablePath(n,jumps));
    }
    public static int climbStairVariablePath(int n,int[] jumps){


        int[] dp=new int[n+1];
        dp[n]=1;
        for (int i = jumps.length-1; i>=0; i--) {
            for (int j = 1; j <= jumps[i] && j+i< dp.length; j++) {
                dp[i]+=dp[j+i];
            }


        }
        return dp[0];
    }

}