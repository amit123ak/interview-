// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        String s="Tomorrow";
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c= s.charAt(i);
            if(c=='o')
            {
                count++;
                for(int j=0;j<count;j++)
                {
                    sb.append('$');
                }
            }else{
                sb.append(c);
            }
            
        }
        System.out.println(sb);
        
    }
}
