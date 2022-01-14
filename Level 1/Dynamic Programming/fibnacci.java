/*
1. You are given a number n.
2. You are required to print the nth element of fibonnaci sequence.

Note -> Notice precisely how we have defined the fibonnaci sequence
0th element -> 0
1st element -> 1
2nd element -> 1
3rd element -> 2
4th element -> 3
5th element -> 5
6th element -> 8

Constraints
0 <= n <= 45

Format
Input
A number n

Output
A number representing the nth element of fibonnaci sequence

Example
Sample Input

10

Sample Output
55
 */
import java.util.Scanner;

class Main{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int fibNth=0;
        int[] fibArr=new int[n];
        System.out.println(fib(n,fibNth,fibArr));
    }
    public static int fib(int n,int fibNth,int[] fibArr){
        if(n==0){
            fibArr[0]=0;
            return  0;
        }
        if (n==1){
            fibArr[1]=1;
            return 1;
        }
        else{
            if (fibArr[n-1]==0)
            {
                fibArr[n-1]=fib(n-1,fibNth,fibArr)+fib(n-2,fibNth,fibArr);
                fibNth=fibArr[n-1];
            }
            else {
                fibNth=fibArr[n-1];
            }
        }

        return fibNth;
    }

}