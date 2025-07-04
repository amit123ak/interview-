// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
       int nums[]={1,2,3,4,5,6,7};
       
       int k=3;
       k=k%nums.length;
       
       reverse(nums,0,nums.length-1);
       reverse(nums,0,k-1);
       reverse(nums,k,nums.length-1);
       
       for(int a:nums)
       {
           System.out.print(a+ " ");
       }
        
    }
    
    public static void reverse(int nums[],int start,int end)
    {
        while(start<end)
        {
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        end--;
        start++;
        
        }
    }
}
