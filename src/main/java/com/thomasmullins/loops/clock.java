package com.thomasmullins.loops;

import java.util.Date;

public class clock {
    public static void main(String[] args) throws Exception{

        while (true) {
            Date d = new Date();
            System.out.println(d);
            Thread.sleep(1000);
        }
    }
}
