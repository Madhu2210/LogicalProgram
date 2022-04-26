package com.bridglabz.logical;

public class LogicalPrograms {
    public static void main(String[] args)
    {
        char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
        int max=1000000000;
        int random=(int) (Math.random()*max);
        StringBuffer sbf=new StringBuffer();

        while (random>0)
        {
            sbf.append(chars[random % chars.length]);
            random /= chars.length;
        }

        String couponCode=sbf.toString();
        System.out.println("Coupon Code: "+couponCode);
    }
}