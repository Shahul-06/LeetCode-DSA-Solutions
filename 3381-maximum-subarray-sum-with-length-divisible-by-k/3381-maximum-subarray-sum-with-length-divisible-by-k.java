class Solution {

    public long maxSubarraySum(int[] nums, int k) {

        int n = nums.length;

        long[] minPrefix = new long[k];
        boolean[] seen = new boolean[k];

        for (int i = 0; i < k; i++) {
            minPrefix[i] = Long.MAX_VALUE;
        }

        long prefixSum = 0;
        long answer = Long.MIN_VALUE;

        // prefix sum = 0
        minPrefix[0] = 0;
        seen[0] = true;

        for (int i = 0; i < n; i++) {

            prefixSum += nums[i];

            int remainder = (i + 1) % k;

            if (seen[remainder]) {
                long currentSum = prefixSum - minPrefix[remainder];
                answer = Math.max(answer, currentSum);
            }

            if (!seen[remainder] || prefixSum < minPrefix[remainder]) {
                minPrefix[remainder] = prefixSum;
                seen[remainder] = true;
            }
        }

        return answer;
    }
}