class Solution {
    public int[] getConcatenation(int[] nums) {

        int ans[]=new int[nums.length+nums.length];

        int arr[]=nums.clone();

        for(int i=0;i<nums.length;i++)
        {
            ans[i]=nums[i];
        }
        for(int i=arr.length;i<ans.length;i++)
        {
            ans[i]=arr[i-arr.length];
        }
        return ans;
        
    }
}
