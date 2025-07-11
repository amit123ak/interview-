// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        
        int num[]={1,2,3,4};
        int num1[]=new int[num.length];
        int i;
        
        for( i=0;i<num.length;i++)
        {
            int sum=1;
         for(int j=0;j<num.length;j++)
         {
           if(i!=j)
           {
           sum=sum* num[j];
            
           }
           
         }
         num1[i]=sum;
         System.out.println(sum);
         
              
        }
        

    }
}
