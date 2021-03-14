public class Solution9 {
    public int jumpFloorII(int target) {
        int sum = 1;
        for (int i = 1; i < target; i++)
            sum += jumpFloorII(i);
        return sum;
    }
}
