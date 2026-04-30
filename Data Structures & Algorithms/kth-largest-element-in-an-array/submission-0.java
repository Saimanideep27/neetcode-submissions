class Solution {
    public int findKthLargest(int[] nums, int k) {

        List<Integer> list = Arrays.stream(nums)
                                   .boxed()
                                   .sorted(Comparator.reverseOrder())
                                   .skip(k-1)
                                   .collect(Collectors.toList());
        return list.get(0);
        
    }
}
