package com.company;

public class Rec4 {
    private static int fact(int n){
        int result;
        if (n == 1)
            return 1;
        else{
            result = fact(n - 1) * n;
            return result;
        }
    }

    public static void m(int x){
        System.out.println(fact(x));
    }
}
