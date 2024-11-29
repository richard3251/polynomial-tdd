package com.ll;

public class Calc {

    public static int run(String expr) {
       String[] nums = expr.split(" \\+ ");
       int num1 = Integer.parseInt(nums[0]);
       int num2 = Integer.parseInt(nums[1]);
       return num1 + num2;
    }
}
