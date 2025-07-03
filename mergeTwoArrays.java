
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        
        int node1[]={1,2,3,0,0,0,0};
        int node2[]={2,3,6,7};
        int m=3;
        int n=4;
        int i=m-1;
        int j=n-1;
        int k=(m+n)-1;
        
        while(j>=0)
        {
            if( i>=0 && node1[i]>node2[j] )
            {
                node1[k]=node1[i];
                k--;
                i--;
            }else{
                node1[k]=node2[j];
                
                j--;
                k--;
            }
        }
        for(int p=0;p<node1.length;p++)
        {
            System.out.println(node1[p]);
        }
        
        
    }
}
