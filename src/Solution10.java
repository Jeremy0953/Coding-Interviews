public class Solution10 {
    public int rectCover(int target) {
        if (target == 0)
            return 0;
        if (target==1)
            return 1;
        else if (target==2)
            return 2;
        else
        {
            //return rectCover(target-1)+rectCover(target-2);
            int pre = 1;
            int post = 2;
            int sum = 0;
            for (int i = 2;i<target;i++)
            {
                sum = pre+post;
                pre = post;
                post = sum;
            }
            return sum;
        }
    }
}
