class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int sum;
        int left = 0;
        int right = numbers.length - 1;
        int[] result = new int[2];
        while(left < right){
            sum = numbers[left] + numbers[right];

            if(sum > target){
                right--;
            }
            else if(sum < target){
                left++;
            }
            else{
                result[0] = left+1;
                result[1] = right+1;
                return result;
            }
        }
        
        return new int[]{-1 , -1};
    }
}
