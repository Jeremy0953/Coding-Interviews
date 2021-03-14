public class Solution11 {
    public int NumberOf1(int n) {
        if (n==-2147483648)
            return 1;
        if (n==0)
            return 0;
        else if (n>0)
        {
            int sum = 0;
            while(n/2!=0)
            {
                if (n%2==1)
                    sum++;
                n = n/2;
            }
            sum++;
            return sum;
        }
        else
        {
            n = -n;
            boolean flag = true;
            int sum = 0;
            int count = 0;
            while(n/2!=0)
            {
                if (flag)
                    count++;
                if (n%2==1)
                {
                    sum++;
                    flag = false;
                }
                n = n/2;
            }
            if (flag)
                count++;
            sum++;
            return 32-count-(sum-1)+1;
        }
    }

    public static void main(String[] args) {
        Solution11 solution11 = new Solution11();
        System.out.println(solution11.NumberOf1(-1));
    }
}
