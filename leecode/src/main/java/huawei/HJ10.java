package huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ：wang xiaofeng
 * @date ：Created in 2023-07-31 15:47
 * @description：字符个数统计
 */
public class HJ10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.next().toCharArray();
        int[] result = new int[200];
        Arrays.fill(result,0);
        for (char aChar : chars) {
            result[aChar]++;
        }

        for (int i = Character.valueOf('A'); i <=Character.valueOf('z') ; i++) {
            if(result[i]>0){
                System.out.println((char)i+"出现的次数是："+result[i]);
            }
        }

    }
}
