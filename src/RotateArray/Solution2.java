package RotateArray;
// 面试题10.03 旋转数组中的搜索
public class Solution2 {
    public int search(int[] arr, int target) {
        int first = 0;
        int last = arr.length-1;
        int mid;
        int position = -1;
        while (first<last)
        {
            mid = first + (last-first)/2;
            if (arr[mid]>arr[last])
            //mid位于第一个序列
            {
                if (target<arr[last])
                //target一定位于第二个序列，所以一定在mid右边
                {
                    first = mid+1;
                }
                else if (target>arr[last])
                //target一定位于第一个序列，但是不知道在mid的左右所以要再比较一下
                {
                    if (target<arr[mid])
                    {
                        last = mid-1;
                    }
                    else if (target>arr[mid])
                    {
                        first = mid+1;
                    }
                    else//因为不知道前面还有没有其他相等的所以在包含mid的前面再找一下
                    {
                        last = mid;
                    }
                }
                else//在last的位置找到target，但是不知道前面有没有了
                {
                    position = last;
                    last = last-1;
                }
            }
            else if (arr[mid]<arr[last])
            //mid位于第二个序列
            {
                if (target>arr[last])
                //target一定位于第一个序列，所以一定在mid左边
                {
                    last = mid-1;
                }
                else if (target<arr[last])
                //target一定位于第二个序列，但是不知道在mid的左右所以要再比较一下
                {
                    if (target<arr[mid])
                    {
                        last = mid-1;
                    }
                    else if (target>arr[mid])
                    {
                        first = mid+1;
                    }
                    else//因为不知道前面还有没有其他相等的所以在包含mid的前面再找一下
                    {
                        last = mid;
                    }
                }
                else//在last的位置找到target，但是不知道前面有没有了
                {
                    position = last;
                    last = last-1;
                }
            }
            else
            {
                if (arr[last]==target)
                {
                    position = last;
                    last--;
                }
                else
                    last--;
            }
        }
        if (arr[first]==target)
            position = first;
        return position;
    }
}
