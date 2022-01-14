/*
1. You are given a string str.
2. You are required to find the character with maximum frequency.

Constraints
0 < str.length() <= 100
There will be a single character with highest frequency

Format
Input
A string str

Output
The character with highest frequency

Example
Sample Input

zmszeqxllzvheqwrofgcuntypejcxovtaqbnqyqlmrwitc

Sample Output
q
 */
import java.util.HashMap;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        HashMap<Character,Integer> freq=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(freq.containsKey(ch)){
                freq.replace(ch,freq.get(ch)+1);
            }
            else {
                freq.put(ch,1);
            }

        }
        String ans="";
        int max=0;
        for (Character ch:freq.keySet()
        ) {
            if(freq.get(ch) > max){
                ans=ch+"";
                max= freq.get(ch);
            }

        }

        System.out.println(ans);
    }

}