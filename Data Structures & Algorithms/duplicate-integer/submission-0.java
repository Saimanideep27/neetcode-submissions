class Solution {
    public boolean hasDuplicate(int[] nums) {

        boolean dup = false;     
        List<Integer> res = Arrays.stream(nums)
                                .boxed()
                                .collect(Collectors.toList());
        for(int i = 0; i < res.size(); i++){
            if(res.lastIndexOf(res.get(i)) != i){
                dup = true;
                return dup;
            }
        }
        return dup;
    }
}