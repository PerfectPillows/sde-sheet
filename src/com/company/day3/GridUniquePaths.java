package com.company.day3;

public class GridUniquePaths {
    public static int solution(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i = 0; i < m;i++){
            dp[i][0] = 1;
        }
        for(int j = 0; j < n;j++){
            dp[0][j] = 1;
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n ; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j - 1];
            }
        }

        return dp[m-1][n-1];

    }


    public static void test(){
       int m,n;
       m = 3;
       n = 7;
       System.out.println(solution(m,n));
    }
}
