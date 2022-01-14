/*
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print the longest sequence of consecutive elements in the array (ignoring duplicates).

Note -> In case there are two sequences of equal length (and they are also the longest), then print the one for which the starting point of which occurs first in the array.

Constraints
1 <= n <= 30
0 <= n1, n2, .. n elements <= 15

Format
Input
A number n
n1
n2
.. n number of elements

Output
Elements of longest sequence of consecutive elements of array in separate lines (ignoring duplicates)

Example
Sample Input

17
12
5
1
2
10
2
13
7
11
8
9
11
8
9
5
6
11

Sample Output
5
6
7
8
9
10
11
12
13
 */

import java.util.Arrays;
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
        Arrays.sort(arr1);

        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey((arr1[i]-1))){
                map.put(arr1[i],map.get((arr1[i]-1))+1 );
            }
            else {
                map.put(arr1[i],1 );
            }
        }
        int max=0;
        int startpoint=0;

        for (int val: map.keySet()
        ) {
            if(max<map.get(val)){
                max=map.get(val);
                startpoint=val-max+1;

            }
        }

        for (int i = 0; i < max; i++) {
            System.out.println(startpoint+i);
        }

    }

}