import java.util.ArrayList;
public class Solution6 {
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0)
            return 0;
        int last = array.length-1;
        int target;
        int first = 0;
        int mid;
        while (first<last)
        {
            mid = first+(last-first)/2;
            target = array[last];
            if (array[mid]>target)
                first = mid+1;
            else if(array[mid]<target)
                last = mid;
            else
                last = last-1;
        }
        return array[first];
    }
}
