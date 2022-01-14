/*
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. You are required to find the intersection of a1 and a2. To get an idea check the example below:

if a1 -> 1 1 2 2 2 3 5
and a2 -> 1 1 1 2 2 4 5
intersection is -> 1 1 2 2 5

Note -> Don't assume the arrays to be sorted. Check out the question video.

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
All relevant elements of intersection in separate lines
The elements of intersection should be printed in order of their occurence in a2.

Example
Sample Input

7
1
1
2
2
2
3
5
7
1
1
1
2
2
4
5

Sample Output
1
1
2
2
5
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
            else {
                map.replace(arr1[i],map.get(arr1[i])+1 );
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if(map.containsKey(arr2[i])){
                if(map.get(arr2[i])>0) {
                    System.out.println(arr2[i]);
                    map.replace(arr2[i],map.get(arr2[i])-1);
                }
            }
        }
    }

}