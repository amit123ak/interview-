// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        
        // find logest subString without reapting char 
        String s="abcabcab";
        int max=0;
        int start =0;

        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char c= s.charAt(i);
            while(set.contains(c))
            {
               set.remove(s.charAt(start)); 
               start++;
               
            }
            max=Math.max(max,i-start+1);
            set.add(c);
        }
        System.out.println(max);
    }
}
