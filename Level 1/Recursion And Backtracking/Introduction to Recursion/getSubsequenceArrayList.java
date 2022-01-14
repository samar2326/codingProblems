/*
1. You are given a string str.
2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
Use sample input and output to take idea about subsequences.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.
Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints
0 <= str.length <= 20

Format
Input
A string str

Output
Contents of the arraylist containing subsequences as shown in sample output

Example
Sample Input

abc

Sample Output
[, c, b, bc, a, ac, ab, abc]


 */
import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        String str=scn.nextLine();
        ArrayList<String> ans=gss(str);
        System.out.println(ans);

    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> baseresult= new ArrayList<>();
            baseresult.add("");
            return baseresult;

        }
        char ch= str.charAt(0);
        String restString=str.substring(1);
        ArrayList<String> restRes=gss(restString);
        ArrayList<String> ans= new ArrayList<>();
        for (String s:restRes) {
            ans.add(""+s);
        }
        for (String s:restRes) {
            ans.add(ch+s);
        }

        return ans;
    }

}