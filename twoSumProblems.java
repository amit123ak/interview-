// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        List<int[]> list=new ArrayList<>();
        
        //two sum prod
       // int nums[] = {2,7,11,15};
        //int target = 9;
        // find the index 
        
        // int nums[] = {3,2,4};
        // int target = 6;
        
       int nums[] = {3,3};
       int target = 6;

        
     for(int i=0;i<nums.length;i++)
     {
      for(int j=i+1;j<nums.length;j++)
      {
          if(nums[i]+nums[j]==target)
          {
             list.add(new int[]{i,j});
          }
      }
     }
 
   for(int a[]:list)
   {
       System.out.println(Arrays.toString(a));
   }

    }
}
