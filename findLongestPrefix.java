// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        
        //find the length of last word
        String str="flower flow flight";
      
       String s1[]=str.split("\\s+");
       
       Arrays.sort(s1);
      int index=0;
      String str1=s1[0];
      String str2=s1[s1.length-1];
      while(index<str1.length())
      {
          
          if(str1.charAt(index)==str2.charAt(index))
          {
              index++;
          
          }else{
              break;
          }
      }
      
      System.out.println(str1.substring(0,index));
       

      
     
    }
    
  
    }
