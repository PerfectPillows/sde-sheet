package com.company.day3;

import com.company.Helper;

public class Pow {

    public static double solution(double x,int n) {
       double ans = 1.0;
       long nn = n;
       if( nn < 0 ) nn = -1 * nn;
       while(nn > 0){
           if( nn % 2  == 1 ){
                ans = ans * x;
                nn = nn - 1;
           }
           else {
               x = x * x;
               nn = nn / 2;
           }
       }
       if(n < 0) ans = 1.0 / ans;

       return ans;
    }

    public static void test(){
        double x = 2.0;
        int n = 10;
        System.out.println(solution(x,n));
    }
}
