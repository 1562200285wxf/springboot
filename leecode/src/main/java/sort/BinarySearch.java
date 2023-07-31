package sort;

import java.util.Arrays;

/**
 * @author ：wang xiaofeng
 * @date ：Created in 2023-07-31 19:58
 * @description： 二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1,4,6,8,2},2));
    }
    public static int binarySearch(int[] num,int key){
        Arrays.sort(num);
        int low = 0;
        int high = num.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(num[mid]<key){
                low=mid+1;
            }
            else if(num[mid]>key){
                high = mid-1;
            }
            else{
                return mid;
            }
        }
        return low;
    }
}
