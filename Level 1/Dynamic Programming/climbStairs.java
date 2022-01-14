/*
1. You are given a number n, representing the number of stairs in a staircase.
2. You are on the 0th step and are required to climb to the top.
3. In one move, you are allowed to climb 1, 2 or 3 stairs.
4. You are required to print the number of different paths via which you can climb to the top.

Constraints
0 <= n <= 20

Format
Input
A number n

Output
A number representing the number of ways to climb the stairs from 0 to top.

Example
Sample Input

4

Sample Output
7
 */
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int[] stair=new int[n+1];
        System.out.println(climbStair(n,stair));
    }
    public static int climbStair(int n,int[] stair){
        if (n<0){
            return  0;
        }
        if (n==1 || n==0)
        {
            return 1;
        }
        if(stair[n]!=0){
            return stair[n];
        }
        int np1= climbStair(n-1,stair);
        int np2=climbStair(n-2,stair);
        int np3=climbStair(n-3,stair);
        int totalpath=np1+np2+np3;
        stair[n]=totalpath;

        return totalpath;
    }

}