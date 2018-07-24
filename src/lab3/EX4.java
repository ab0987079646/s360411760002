package lab3;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int selected ;

        // show opions

        System.out.println("กรุราเลือกรายวิชาที่คุณชอบมากที่สุด ?");
        System.out.println("1.SA");
        System.out.println("2.database");
        System.out.println("3.accounting");
         System.out.print("กรอกหมายเลือกรายวิชา");


         selected = scanner.nextInt();







        //switch-case
      switch (selected) {


          case 1: System.out.println("คุณชอบ SA "); break;
          case 2: System.out.println("คุณชอบ database "); break;
          case 3: System.out.println("คุณชอบaccounting  "); break;

          default: System.out.println("กรุณากรอกหมายเลข 1-3.");


      }














    }//main










}//Class
