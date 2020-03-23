package org.andestech.learning.sber2020;

public class Vars {

    private static void testVar(){

        int age=2_145_489_345;
        System.out.println("age:" + age);

    }

    public static void main(String[] args)
    {
      byte b1 = 127, b2= -128, b3=(byte)0b11111111;

      int data1=0,     age=2_489_345,
          count=1001, code=0b1001_0101,
             g8=06547, g16=0xa11ff;

      String data2 = "23";
      System.out.println("age:" + age);
        System.out.println("Max: " + Byte.MAX_VALUE);
        System.out.println("b3="+b3);
        System.out.println("-128="+ (byte)0b10000000 );
      testVar();

      // short

       short sh1 = 31333 + 100;
        System.out.println("Max short: " + Short.MAX_VALUE);
      // int
        System.out.println("Max int: " + Integer.MAX_VALUE);

     //long
        long L1 = 92835793845794534L;
        System.out.println("Max long: " + Long.MAX_VALUE);
        System.out.println("Max long digits: " + Math.log10(Long.MAX_VALUE));

     // float
         float f1 = 1234.567891234f;
         System.out.println("f1=" + f1);
         float f2 = (float)(1.0 + 1 - 2);
        System.out.println(f2);

     // double
        double d1 = 1.234567890123456789012345678;
        System.out.println("d1="+d1);

     // char
        char ch1 = 'A', ch2 = 65, ch3='7';
        System.out.println(ch2);
        System.out.println((int)ch3);

    // String
       String s1 = "Hi all!!!";
       System.out.println(s1.toUpperCase());

    // Boolean

       boolean bool1 = true, bool2 = false;


    }
}
