package com.thomasmullins.loops;

public class practice {
//    public static void main(String[] args) {
//
//        for (int x = 0; x <= 5; x++) {
//            System.out.println(x);
//        }
//    }
//}


//    public static void main(String[] args) {
//
//        for (int x = 10; x >= 0; x = x - 1) {
//            System.out.println(x);
//        }
//    }
//}


    public static void main(String[] args) {
        int miles = 150000;
        int oil_change = 3000;

        for (int interval = 0; interval < 8; interval++) {
            miles = miles + oil_change;
            System.out.println(miles);
        }
    }
}