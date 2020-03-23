package org.andestech.learning.sber2020;

public class Operations {

    public static void main(String[] args)
    {
        byte b1 = 0b1001, b2 = 0b1_1110;
        byte res1 = (byte)(b1 & b2);
        byte res2 = (byte)(b1 | b2);
        byte res3 = (byte)(~b1);
        byte res4 = (byte)(b2 ^ b1);
        byte res5 = (byte)(b1<<2);

        System.out.println(b1 +"-->"+ Integer.toBinaryString(b1));
        int res6 = 0b101<<6;
        System.out.println(res6 +"-->"+ Integer.toBinaryString(res6));

        //-------------------------
        // +-*/%
        System.out.println(10%4);

        short sh2 = -234;
        double d1 = 10000 + 12.22 + 0xfff3ff4 + sh2;

        // from String to Number

        String age = "22";
        int ageStore;
        ageStore = Integer.parseInt(age,10);

        System.out.println("age: " + ageStore);




    }

}
