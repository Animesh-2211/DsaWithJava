class Solution {
    public void RightRotate(int[] nums, int k) {

        for (int i = 0; i < k; i++) {
            int first = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {

                nums[j] = nums[j - 1];
            }
            nums[0] = first;

        }

    }
}