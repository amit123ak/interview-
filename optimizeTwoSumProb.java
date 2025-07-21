// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        
 int nums[] = {3,2,4};
 int target = 6;
 
 for(int i=0;i<nums.length;i++)
 {
     if(map.containsKey(target-nums[i]))
     {
         System.out.println(map.get(target-nums[i])+ " "+ i);
     }
     map.put(nums[i],i);
 }
  
  
  



               

    }
}
