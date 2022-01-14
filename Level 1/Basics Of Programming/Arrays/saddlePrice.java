/*
1. You are given a square matrix of size 'n'. You are given n*n elements of the square matrix.
2. You are required to find the saddle price of the given matrix and print the saddle price.
3. The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.
Constraints
1 <= n <= 10^2
-10^9 <= e11, e12, .. n * m elements <= 10^9
Format
Input
A number n
e11
e12..
e21
e22..
.. n * n number of elements of array a
Output
Saddle point of the matrix if available or "Invalid input" if no saddle point is there.
Example
Sample Input
4
11
12
13
14
21
22
23
24
31
32
33
34
41
42
43
44

Sample Output

41

*/
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] arr=new int[n][n];
        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
        boolean flag=false;
        for(int i=0;i<n;i++){
            int min=arr[i][0];
            int minIndexCol=0;

            for(int j=1;j<n;j++)
            {
                if(arr[i][j]<min){
                    min=arr[i][j];
                    minIndexCol=j;
                }
            }
            int max=arr[i][minIndexCol];
            for(int k=0;k<n;k++){
                if(max<arr[k][minIndexCol])
                {
                    break;
                }
                if(k==n-1){
                    flag=true;
                    System.out.println(max);
                }
            }
            if(flag){
                break;
            }

        }
        if(flag==false)
        {
            System.out.println("Invalid input");
        }


    }

}