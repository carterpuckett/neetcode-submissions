class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numMap.containsKey(target - nums[i])) {
                int[] answer = {numMap.get(target - nums[i]), i};
                return answer;
            } else {
                numMap.put(nums[i], i);
            }
        }
        return nums;
    }
}
