import java.util.ArrayList;
import java.util.List;

//54.螺旋矩阵 (就很朴素的绕一圈走就行，绕完一圈然后去掉外面一圈对里面的再绕）
public class Solution13 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int x = 0;
        int y = 0;
        int width = matrix[0].length;
        int height = matrix.length;
        while(width>0&&height>0)
        {
            if (width==1)
            //如果矩形只有竖着一条，就竖着输出
            {
                for (int i = 0; i<height; i++)
                {
                    list.add(matrix[x+i][y]);
                }
                break;
            }
            if (height==1)
            //如果矩形只有横着一条那么就横着输出
            {
                for (int i = 0; i<width; i++)
                {
                    list.add(matrix[x][y+i]);
                }
                break;
            }
            //如果矩形不是只有一条，则一顺时针方向走一圈
            //先从右上角横着往右走
            for (int i = 0; i<width; i++)
            {
                list.add(matrix[x][y+i]);
            }
            //再竖着往下走
            for (int i = 1; i<height; i++)
            {
                list.add(matrix[x+i][y+width-1]);
            }
            //再横着往左走
            for (int i = 1; i<width; i++)
            {
                list.add(matrix[x+height-1][y+width-1-i]);
            }
            //再往上走
            for (int i = 1; i<height-1; i++)
            {
                list.add(matrix[x+height-1-i][y]);
            }
            x = x+1;
            y = y+1;
            height = height-2;
            width = width-2;
        }
        return list;
    }
}
