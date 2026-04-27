class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = Arrays.stream(nums)
                                     .boxed()
                                     .collect(Collectors.toSet());
        int max = 0;

        for(int num : nums){
            if(!set.contains(num - 1)){
                int currentNum = num;
                int currentCount = 1;

                while(set.contains(currentNum + 1)){
                    currentNum += 1;
                    currentCount += 1;
                }
                max = Math.max(max , currentCount);
            }
        }
      return max;  
    }
}
