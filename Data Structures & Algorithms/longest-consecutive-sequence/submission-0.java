class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLength = 0;
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }

        for (int num : numSet) {
            int length = 1;
            if (!numSet.contains(num-1)){
                int n = 1;
                while (numSet.contains(num+n)) {
                    length++;
                    n++;
                }
            }
            if (length > maxLength) {
                maxLength = length;
            }
        }

        return maxLength;
    }
}
