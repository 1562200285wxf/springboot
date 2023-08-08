package 代码随想录.数组;

/**
 * @author ：wang xiaofeng
 * @date ：Created in 2023-08-08 19:55
 * @description：
 */
public class _029长度最小的子数组 {

    public static void main(String[] args) {
        int[] ints = new int[]{1,1,1,1,1,1,1,1};
        System.out.println(minSubArrayLen(11,ints));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int slow=0;
        int length = nums.length;
        int result = Integer.MAX_VALUE;
        int sum = 0;
        for (int fast = 0; fast < length; fast++) {
            sum+=nums[fast];
            // 注意这里使用while，每次更新 i（起始位置），并不断比较子序列是否符合条件
            while (sum>=target){
                result = Math.min(result,fast-slow+1);
                // 这里体现出滑动窗口的精髓之处，不断变更i（子序列的起始位置）
                sum-=nums[slow++];
            }
        }
        return result==Integer.MAX_VALUE?-1:result;
    }
}
