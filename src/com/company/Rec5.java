package com.company;

public class Rec5 {

    private static int length;
    private static int step = 0;

    public static int f(int n){
        step++;
        length = n;
        space();
        if (n == 0){
            System.out.println(""+n+"<- (" +step+")");
            return 0;
        }
        else
            if (n == 1){
                System.out.println(""+n+"<- (" +step+")");
                return 1;
            }
            else {
                System.out.println(""+n+"<- (" +step+")");
                return f(n - 2) + f(n - 1);
            }

    }

    public static void space(){
        for (int i = 0; i < length; i++){
            System.out.print(" ");
        }
    }

    public static void m(int x){
        System.out.println(f(x));
    }
}
