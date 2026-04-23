class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> s = new HashSet<>();
        boolean res = false;
        for(int i = 0; i < nums.length; i++){
            if(!s.contains(nums[i])){
                s.add(nums[i]);
            }
            else{
                res = true;
                return res;
            }
        }
		return res;
    }
}