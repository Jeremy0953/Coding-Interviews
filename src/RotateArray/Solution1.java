package RotateArray;
//Leetcode 189.旋转数组
public class Solution1 {
    /*
    public void rotate(int[] nums, int k) {
        int steps = k%nums.length;
        int [] temp = new int[steps];
        for (int i =1;i<=nums.length;i++)
        {
            if (i<=steps)
            {
                temp[steps-i] = nums[nums.length-i];
                //nums[nums.length-i] = nums[nums.length-i-steps];
            }
            if (nums.length-i>=steps)
            {
                nums[nums.length-i] = nums[nums.length-i-steps];
            }
            else
            {
                nums[nums.length-i] = temp[nums.length-i];
            }
        }
    }
    */
    public void rotate(int[] nums, int k) {
        int steps = k%nums.length;
        int [] temp = new int[steps];
        for (int i =1;i<=nums.length;i++)
        {
            if (i<=steps)
            {
                temp[steps-i] = nums[nums.length-i];
                //nums[nums.length-i] = nums[nums.length-i-steps];
            }
            if (nums.length-i>=steps)
            {
                nums[nums.length-i] = nums[nums.length-i-steps];
            }
            else
            {
                nums[nums.length-i] = temp[nums.length-i];
            }
        }
    }
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        solution1.rotate(new int[]{1,2,3},2);
    }
}
