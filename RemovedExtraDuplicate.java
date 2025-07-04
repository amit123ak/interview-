// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
       int [] num={1,1,1,2,2,2,3,4,4,4,5,5};
       int count=0;
       
       
       for(int i=0;i<num.length;i++)
       {
           
           if(i<2 || num[i]!=num[count-2])
           {
               num[count]=num[i];
               count++;
               
           }
       }
         
       
       for(int i=0;i<count;i++)
       {
          System.out.println(num[i]);
       }
    }
}
