package 代码随想录.数组;

/**
 * @author ：wang xiaofeng
 * @date ：Created in 2023-08-08 19:04
 * @description：
 */
public class _977有序数组的平方 {
    public static void main(String[] args) {
        int[] ints = new int[]{-4,-1,0,3,10};
        for (int i : sortedSquares(ints)) {
            System.out.println(i);
        }
    }

    public static int[] sortedSquares(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int slowIndex = 0;
        int fastIndex = length-1;
        int index = length-1;
        while (slowIndex<=fastIndex){
            int squreSlow = nums[slowIndex]*nums[slowIndex];
            int squreFast = nums[fastIndex]*nums[fastIndex];
            if(squreSlow<squreFast){
                result[index]=squreFast;
                fastIndex--;
            }else {
                result[index]=squreSlow;
                slowIndex++;
            }
            index--;
        }
        return result;
    }
}
