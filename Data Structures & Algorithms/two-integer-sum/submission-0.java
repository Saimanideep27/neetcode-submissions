class Solution {
    public int[] twoSum(int[] nums, int target) {
           
    
    int[] res = new int[2];
    List<Integer> li = Arrays.stream(nums)
                                   .boxed()
                                   .toList();
    for(int i = 0; i < nums.length; i++){
        if(li.contains(target - nums[i])){
            if(i != li.indexOf(target - nums[i])){
                res[0] = i;
                res[1] = li.indexOf(target - nums[i]);
                Arrays.sort(res);
                return res;
            }
        }
    }
    return res;
        
    }
}
