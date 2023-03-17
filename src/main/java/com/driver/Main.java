package com.driver;

public class Main {
    public static void main(String[] args)
    {
        RWOnly r = new RWOnly();
//        System.out.println(r.name + "0");
//        java: name has private access in com.driver.RWOnly
        r.setName("Kalpesh");
        String ans = r.getName();
        System.out.println(ans);
    }
  
}