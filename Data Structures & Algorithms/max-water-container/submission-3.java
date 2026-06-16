class Solution {
    public int maxArea(int[] heights) {
        int front = 0;
        int back = heights.length - 1;
        int maxWater = 0;

        while (front < back) {
            int water = (back-front) * Math.min(heights[front], heights[back]);

            maxWater = Math.max(maxWater, water);

            if (heights[front] > heights[back]) {
                back--;
            } else if (heights[front] <= heights[back]) {
                front++;
            }
        }
        return maxWater;
    }
}
