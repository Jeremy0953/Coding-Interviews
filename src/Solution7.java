public class Solution7 {
    public int Fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
        {
            int a0 = 0;
            int a1 = 1;
            int sum = 0;
            for (int i = 2;i<=n; i++)
            {
                sum = a0+a1;
                a0 = a1;
                a1 = sum;
            }
            return sum;
        }
            //return Fibonacci(n-1)+Fibonacci(n-2);
    }

    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        System.out.println(solution7.Fibonacci(4));
    }
}