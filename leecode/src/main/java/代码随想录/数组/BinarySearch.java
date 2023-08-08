package 代码随想录.数组;

import java.util.Arrays;

/**
 * @author ：wang xiaofeng
 * @date ：Created in 2023-07-31 19:58
 * @description： 二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{-1,0,3,5,9,12},2));
    }
    public static int binarySearch(int[] nums,int target){
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)>>1;
            if(nums[mid]<target){
                low=mid+1;
            }
            else if(nums[mid]>target){
                high = mid-1;
            }
            if(nums[mid]==target)
                return mid;
        }
        return -1;
    }
}
