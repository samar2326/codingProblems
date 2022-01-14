/*
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. You are required to print all elements of a2 which are also present in a1 (in order of their occurence in a2). Make sure to not print duplicates (a2 may have same value present many times).

Constraints
1 <= n1, n2 <= 100
0 <= a1[i], a2[i] < 10
Time complexity should be O(n)

Format
Input
A number n1
n1 number of elements line separated
A number n2
n2 number of elements line separated

Output
All relevant elements of a2 in separate lines (no duplicacy)

Example
Sample Input

9
5
5
9
8
5
5
8
0
3
18
9
7
1
0
3
6
5
9
1
1
8
0
2
4
2
9
1
5

Sample Output
9
0
3
5
8
 */

import java.util.HashMap;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int[] arr1=new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i]=scn.nextInt();
        }
        int m= scn.nextInt();
        int[] arr2=new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i]=scn.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if(!map.containsKey(arr1[i])){
                map.put(arr1[i],1);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if(map.containsKey(arr2[i])){
                System.out.println(arr2[i]);
                map.remove(arr2[i]);
            }
        }
    }

}