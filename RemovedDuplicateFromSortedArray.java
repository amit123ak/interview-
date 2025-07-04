
class RemovedDuplicateFromSortedArray {
    public static void main(String[] args) {
        
        int m[]={1,1,2,3,3,4,5,6,7};
        int count =0;
        for(int i=0;i<m.length-1;i++)
        {
            if(m[i]!=m[i+1])
            {
             m[count]=m[i];
             count++;
            }
        }
        m[count++]=m[m.length-1];
        for(int i=0;i<count;i++)
        {
            System.out.println(m[i]);
        }
        
    }
}
