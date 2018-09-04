package midtem_Exam;

import java.util.Scanner;

public class maidtem_2 {


    public static void main(String[] args) {

        Scanner xx = new Scanner(System.in);
      int w1,w2,w3,w4;

      do {
          System.out.println("คะแนนสอบย่อย : ");
          w1 = xx.nextInt();

          if (w1>20 || w1<0  ) ;
          System.out.println("กรุณากรอกคะแนนไห้ถูกต้อง ");
      }while (w1>20 || w1<0 );

        do {
        System.out.println("คะแนนปฏิบัต : ");
        w2 = xx.nextInt();
            if (w2>20 || w2<0  ) ;
            System.out.println("กรุณากรอกคะแนนไห้ถูกต้อง ");
        }while (w2>20 || w2<0 );



        do {
        System.out.println("คะแนนสอบกลำงภำค : ");
        w3 = xx.nextInt();  if (w3>30 || w3<0  ) ;
        System.out.println("กรุณากรอกคะแนนไห้ถูกต้อง ");
    }while (w3>30 || w3<0 );



        do {
        System.out.println("คะแนนสอบปลำยภำค : ");
        w4 = xx.nextInt();  if (w4>30 || w4<0  ) ;
          System.out.println("กรุณากรอกคะแนนไห้ถูกต้อง ");
}      while (w4>30 || w4<0 );

        System.out.println(w1+w2+w3+w4);

        if (((w1+w2+w3+w4) >= 0 && (w1+w2+w3+w4) <= 49) )
            System.out.println("f");
        else if ((w1+w2+w3+w4) >= 50 && (w1+w2+w3+w4) <= 59)
            System.out.println("D");


        else if ((w1+w2+w3+w4) >= 60 && (w1+w2+w3+w4) <= 69)
            System.out.println("C");

        else if ((w1+w2+w3+w4) >= 70 && (w1+w2+w3+w4) <= 79)
            System.out.println("B");

        else if ((w1+w2+w3+w4) >= 80 && (w1+w2+w3+w4) < 100)
            System.out.println("A");























    }//main









}//class
