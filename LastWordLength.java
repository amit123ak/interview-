// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        
        //find the length of last word
        String str=" amit kumar gondaas ";
       String s=   str.trim();
       String s1[]=str.split("\\s+");
       
       String lastSecond= s1[s1.length-2];
       
      System.out.println(lastSecond.length());
       
       int count =0;
       for(int i=0;i<s.length();i++)
       {
           if(s.charAt(s.length()-1-i)!=' ')
           {
               count++;
           }else{
               break;
           }
       }
       System.out.println(count);
     
    }
    
  
