/*
二维数组
 */
/*
在一个二维数组中，
每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

思路：考虑到二维数组中的大小关系，可以从对角线的顶点开始，如果大小关系判断出来，朝两个方向进行移动即可
 */
public class findNumberFromMatrix {
    public static void main(String[] args){
        int array[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.print(Find(5,array));
    }
    public static boolean Find(int target, int [][] array) {
        int row = 0;
        int line = array[0].length - 1;
        while ((row <= array.length-1) && line >= 0){
            if(target == array[row][line]){
                return true;
            }else if(target < array[row][line]){
                line--;
            }else if(target > array[row][line]){
                row++;
            }
        }
        return false;
    }

}