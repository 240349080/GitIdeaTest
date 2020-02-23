package com.haoran;

import java.util.HashMap;

/**
 * @author guohaoran
 * @create 2020/2/23 19:05
 */
public class DebugTest {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }



        HashMap<String, String> map = new HashMap<>();
        map.put("name","Tom");
        map.put("age","12");
        map.put("school","清华");
        map.put("major","计算机");

        String age = map.get("age");
        System.out.println("age = " + age);

        map.remove("major");
        System.out.println("map = " + map);

    }
}
