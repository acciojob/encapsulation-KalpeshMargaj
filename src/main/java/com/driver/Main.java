package com.driver;

public class Main {
    public static void main(String[] args)
    {
        RWOnly r = new RWOnly();
//        System.out.println(r.name + "0");
//        java: name has private access in com.driver.RWOnly
        r.setter("Kalpesh");
        String ans = r.getter();
        System.out.println(ans);
    }
  
}