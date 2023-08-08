package 代码随想录.数组;

/**
 * @author ：wang xiaofeng
 * @date ：Created in 2023-08-08 18:23
 * @description：
 */
public class _26删除有序数组中的重复项 {
    public static void main(String[] args) {
        int[] ints = new int[]{1,1,2};
        System.out.println(removeDuplicates(ints));
    }

    public static int removeDuplicates(int[] nums) {
        int slowIndex = 0;
        int length=nums.length;
        for (int fastIndex = 1; fastIndex < length; fastIndex++) {
            if(nums[slowIndex]!=nums[fastIndex]){
                slowIndex++;
                nums[slowIndex]=nums[fastIndex];
            }
        }
        return slowIndex+1;
    }
}
