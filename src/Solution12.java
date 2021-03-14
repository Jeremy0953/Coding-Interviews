public class Solution12 {
    /*
    public double Power(double base, int exponent) {
        if (base == 0)
            return 0;
        if (exponent == 0)
            return 1;
        if (exponent == 1)
            return base;
        if (exponent == -1)
            return 1/base;
        if (exponent%2==1)
        {
            double temp = Power(base,exponent/2);
            return (temp*temp)*base;
        }
        if (exponent%2==-1)
        {
            double temp = Power(base,exponent/2);
            return (temp*temp)*(1/base);
        }
        else
        {
            double temp = Power(base,exponent/2);
            return (temp*temp);
        }
    }
    */
    double Power(double b, int n) {
        if (n < 0) {
            b = 1 / b;
            n = -n;
        }
        double x = b; // 记录x^0, x^1, x^2 ...
        double ret = 1.0;
        while (n!=0) {
            if ((n&1)!=0) {
                ret *= x; // 二进制位数是1的，乘进答案。
            }
            x *= x;
            n >>= 1;
        }
        return ret;
    }
    public static void main(String[] args) {
        Solution12 solution12 = new Solution12();
        System.out.println(solution12.Power(2,-3));
    }
}
