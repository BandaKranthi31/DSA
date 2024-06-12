package Arrays;

/**
 * BinarySearch
 */
public class BinarySearch {

   static int nums[] = {3,4,5,6,7,8,9,31};
   static  int length = nums.length;

    public static int binarySearch(int nums[],int length,int target){
        int start = 0;
        int end = nums.length;
        while(start<end)
        {
            int mid = start + (end-start)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) 
            {
                end = mid-1;
            }
            else start = mid+1;
        }
        return -1;

    }


    public static int recursiveBinary(int nums[],int length,int target){
        int start =0;
        int end = nums.length;
        return helper(nums,start,end,target);
    }

    public static int helper(int nums[],int start,int end,int target)
    {
        while (start<=end)
         {
            int mid = start+(end-start)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) return helper(nums, start, mid-1, target);
            else return helper(nums, mid+1, end, target);
         }
         return -1;
    }


    public static void main(String[] args) {
      int interativeans =  binarySearch(nums, length,31);
      int recursiveans = recursiveBinary(nums, length,31);
      System.out.println(interativeans);
      System.out.println(recursiveans);
    }
}