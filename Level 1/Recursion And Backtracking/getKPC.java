/*
1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
2. The following list is the key to characters map :
    0 -> .;
    1 -> abc
    2 -> def
    3 -> ghi
    4 -> jkl
    5 -> mno
    6 -> pqrs
    7 -> tu
    8 -> vwx
    9 -> yz
3. Complete the body of getKPC function - without changing signature - to get the list of all words that could be produced by the keys in str.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints
0 <= str.length <= 10
str contains numbers only

Format
Input
A string str

Output
Contents of the arraylist containing words as shown in sample output

Example
Sample Input

78

Sample Output
[tv, tw, tx, uv, uw, ux]


 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn= new Scanner(System.in);
        String str=scn.next();
        ArrayList<String> ans=getKPC(str);
        System.out.println(ans);
    }

    public static ArrayList<String> getKPC(String str) {
        HashMap<Character,String> nmap=new HashMap<>();
        nmap.put('0',".;");
        nmap.put('1',"abc");
        nmap.put('2',"def");
        nmap.put('3',"ghi");
        nmap.put('4',"jkl");
        nmap.put('5',"mno");
        nmap.put('6',"pqrs");
        nmap.put('7',"tu");
        nmap.put('8',"vwx");
        nmap.put('9',"yz");
        if (str.length()==0){
            ArrayList<String>empty=new ArrayList<>();
            empty.add("");
//            System.out.println("base condition");
            return empty;
        }
        String s=nmap.get(str.charAt(0));
        ArrayList<String> restres=getKPC(str.substring(1));
        ArrayList<String>ans=new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < restres.size(); j++) {
                ans.add(s.charAt(i)+""+restres.get(j));
            }

        }
        return  ans;
    }

}