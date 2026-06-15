public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        int[] solution = new int[2];

        Dictionary<int, int> numDict = new Dictionary<int, int>();
        for (int i = 0; i < nums.Length; i++) {
            int difference = target - nums[i];
            if (!numDict.ContainsKey(difference)) {
                numDict[nums[i]] = i;
            } else {
                solution[0] = numDict[difference];
                solution[1] = i;
            }
            
        }

        return solution;
    }
}
