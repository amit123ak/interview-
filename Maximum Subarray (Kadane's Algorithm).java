// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
    int m[]=   {-2,1,-3,4,-1,2,1,-5,4};
    int max =Integer.MIN_VALUE;
    int sum=0;
    for(int st=0;st<m.length;st++)
    {
        
        sum+=m[st];
        
    max=Math.max(max,sum);
    if(sum<0){
        sum=0;
    }


    }
    
    System.out.println(max);

        
    }
}
