public class Solution1 {
    /*
    public boolean Find(int target, int[][] array)
    //自己想到的某个可行解，但是可能不是最优解，时间复杂度mlogn
    {
        int height = array.length;
        int width = 0;
        if (height>=1) {
            width = array[0].length;
        }
        if (width==0)
            return false;
        for (int i = 0; i < height; i++)
        //从上往下一行一行扫描，在每一行中进行二分查找
        {
            if (array[i][0] <= target && array[i][width - 1] >= target)
            //利用每一行中递增的性质，排除掉不可能出现的行
            {
                int left = 0;
                int right = width - 1;
                int mid;
                while (left <= right) {
                    mid = (left + right) / 2;
                    if (array[i][mid] == target) {
                        return true;
                    } else if (array[i][mid] > target) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
            }
        }
        return false;
    }
    */
    public boolean Find(int target, int[][] array)
    //根据题解给出的答案
    {
        int row = array.length-1;
        if (array[0].length==0)
            return false;
        int col = 0;
        while (row>=0&&col<array[0].length)
        {
            if (array[row][col] == target)
                return true;
            else if (array[row][col] < target)
                col++;
            else
                row--;
        }
        return false;
    }

}


