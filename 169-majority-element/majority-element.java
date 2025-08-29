class Solution {
    public int majorityElement(int[] nums) {
        int maxCount = Integer.MIN_VALUE;
        int majority = nums[0]; 

        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                majority = nums[i]; 
            }
        }
        return majority;
    }
}
