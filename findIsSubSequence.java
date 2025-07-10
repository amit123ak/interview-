// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
      String s="abc";
      String t="ahbgdc";
      System.out.println(IsSubSequence(s,t));
      
      
    }
    
    public static boolean IsSubSequence(String s,String t)
    { 
        int i=0; 
        int j=0;
        
        if(s.length()==0)
        {
            return true;
        }
    
        
        while(i<s.length()&& j<t.length())
        {
            
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
                j++;
            }else{
                j++;
            }
        }
        
        if(i==s.length())
        {
            return true;
        }
        return false;
    }
}
