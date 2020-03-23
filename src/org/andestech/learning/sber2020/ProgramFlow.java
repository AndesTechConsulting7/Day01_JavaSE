package org.andestech.learning.sber2020;

public class ProgramFlow {
    public static void main(String[] args)
    {
      int a  = 1, b=100, c=46;

      if( a!=1 || b!=100) {
          System.out.println("true!!");
          if(c>47) {
              System.out.println("once more true!!");
          }
      }
      else {
          System.out.println("false!!");
          if(c==45) {System.out.println("c==45!!!");}

      }

      // chain
       int count =12;
       if(count==12){
           System.out.println("count==12");
           //....
       }
       else if(count==13){
           System.out.println("count==13");
           //....
       }
       else if(count==14){
           System.out.println("count==14");
           //....
       }
       else {
           System.out.println("Need a right number!!!");
       }

       //---- switch ------------------
       switch (count){
           case 12:  System.out.println("count==12"); break;
           case 13:  System.out.println("count==13"); break;
           case 14:  System.out.println("count==14"); break;
           default:  System.out.println("Need a right number!!!");
       }

       //--- switch "Yes", "No", "DontKnow"
       String answer = "Yes";
       switch (answer.toUpperCase()){
           case "YES": System.out.println("Right choice!!"); break;
           case "NO": System.out.println("Any problem?"); break;
           default: System.out.println("Answer YES or NO!");
       }

       // cycles

       int i =0;
       while(i<10){
        //...
        System.out.print("i="+i+", ");

        ++i;
    }
        System.out.print("\b\b.\n");

        while(true){
            //...
            if(i<0) break;
            System.out.print("i="+i+", ");
            --i;
        }
        System.out.print("\b\b.\n");

        // for

        for (int j = 0; j < 10; j++) System.out.print("j="+j+", ");
        System.out.print("\b\b.\n");

        for (int j = 0; j < 5; j++) {
            System.out.print("j="+j+", ");
        }
        System.out.print("\b\b.\n");

        {   int k = 0;
            for (;;) {
                if(k>10) break;
                System.out.print("k=" + k + ", ");
                //......
                k++;
            }
        }
        System.out.print("\b\b.\n");

        //..... do-while
        do{
         System.out.print("i="+i+", ");

        }while(i++<10);
        System.out.print("\b\b.\n");
        System.out.print("11\t22\t4455\n");
        System.out.print("454\t1\t43\n");

        //    1   2   3  ...
        // 1  1   2   3  ...
        // 2  2   4   6  ...
        //

        int Nj = 15, Nk = 10;
        boolean evj=true, odj=false;
        int jStart=1, dJ=1;

        boolean evk=false, odk=false;
        int kStart=1, dK=1;

        if(evj) {jStart = 2; dJ=2;}
        if(odj) {jStart = 1; dJ=2;}

        if(evk) {kStart = 2; dK=2;}
        if(odk) {kStart = 1; dK=2;}


        System.out.print("\t");
        for (int j = jStart; j <= Nj; j+=dJ) System.out.print(j +"\t");
        System.out.println();

        for (int k = kStart; k <= Nk; k+=dK) {
            System.out.print(k + "\t");
            for (int j = jStart; j <= Nj; j+=dJ) {
                System.out.print(k*j + "\t");
            }
            System.out.println();
        }




    }

}
