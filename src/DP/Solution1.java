package DP;
//343 整数拆分，利用动态规划
import static java.lang.Math.max;

public class Solution1 {
    public int integerBreak(int n) {
        int [] temp = new int[n+1];
        temp[1] = 1;
        temp[2] = 1;
        int max;
        for (int i = 3;i<=n;i++)
        {
            max = 0;
            for (int j = 1;j<i;j++)
            {
                int product = max(temp[j]*(i-j),j*(i-j));
                if (product > max)
                {
                    max = product;
                }
            }
            temp[i] = max;
        }
        return temp[n];
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.integerBreak(10));
    }
}
   