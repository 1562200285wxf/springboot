package hot100;

/**
 * @author ：wang xiaofeng
 * @date ：Created in 2023-07-31 18:29
 * @description：
 */
public class leecode70 {

    public static void main(String[] args) {
        leecode70 leecode70 = new leecode70();
        System.out.println(leecode70.climbStairs(1));
    }
    public int climbStairs(int n) {
        if(n<3)
            return n;
        int[] dp = new int[n + 1];
        dp[2] = 2;
        dp[1] = 1;
        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
