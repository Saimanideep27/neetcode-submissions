class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean dup = false;
        HashSet<Integer> s = new HashSet<>();
    for(int i = 0; i < nums.length; i++){
        s.add(nums[i]);
    }
    if(s.size() != nums.length){
        dup = true;
        return dup;
    }
    return dup;
    }
}