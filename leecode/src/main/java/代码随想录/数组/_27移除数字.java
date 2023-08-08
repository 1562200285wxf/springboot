package 代码随想录.数组;

import org.w3c.dom.ls.LSOutput;

/**
 * @author ：wang xiaofeng
 * @date ：Created in 2023-08-08 18:09
 * @description：移除数组中的数字
 */
public class _27移除数字 {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3},3));
    }


    public static int removeElement(int[] nums, int val) {
        int slowIndex=0;
        int length = nums.length;
        for (int fastIndex = 0; fastIndex < length; fastIndex++) {
            if(nums[fastIndex] != val){
                //这种方式真的是爱了。
                nums[slowIndex++]=nums[fastIndex];
            }
        }
        return slowIndex;
    }
}
