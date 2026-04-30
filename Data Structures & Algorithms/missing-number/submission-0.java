class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int n : nums){
            sum+=n;
        }

        int missingNum = ((nums.length + 1)*(nums.length + 2)/2) - sum - (nums.length + 1);
        return missingNum;
    }
}
