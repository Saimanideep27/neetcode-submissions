class Solution {
    public int maxProduct(int[] nums) {
        int currentMax = nums[0];
        int currentMin = nums[0];
        int globalMax = nums[0];

        for(int i = 1; i < nums.length; i++){
            int n = nums[i];
            int tempMax = currentMax;
            currentMax = Math.max(n, Math.max(n*tempMax , n*currentMin));
            currentMin = Math.min(n, Math.min(n*tempMax , n*currentMin));
            globalMax = Math.max(currentMax , globalMax);
        }
        return globalMax;
    }
}
