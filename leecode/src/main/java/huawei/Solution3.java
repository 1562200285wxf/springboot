package huawei;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author ：wang xiaofeng
 * @date ：Created in 2023-08-08 13:57
 * @description：
 */
public class Solution3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(" "));
    }

    public static int lengthOfLongestSubstring(String s) {
        int pre = 0;
        int max = 0;
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for (int index = 0; index < chars.length; index++) {
            if(!set.contains(chars[index])){
                set.add(chars[index]);
            }else {
                set.clear();
                max = Math.max(max,index-pre);
                pre= index;
                set.add(chars[index]);
            }
        }
        return max;
    }

    public int lengthOfLongestSubstring1(String s) {
        int length = s.length();
        int max = 0;

        Map<Character, Integer> map = new HashMap<>();
        for(int start = 0, end = 0; end < length; end++){
            char element = s.charAt(end);
            if(map.containsKey(element)){
                start = Math.max(map.get(element) + 1, start); //map.get()的地方进行+1操作
            }
            max = Math.max(max, end - start + 1);
            map.put(element, end);
        }
        return max;
    }


}
