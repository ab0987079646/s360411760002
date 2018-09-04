package midtem_Exam;

import java.util.Scanner;

public class midtem_3 {


    public static void main(String[] args) {

        Scanner xx = new Scanner(System.in);
        String a,b;
        int c,d ;
        System.out.print("กรุณากรอกชื่อ-สกุล :");
        a = xx.nextLine();
        System.out.print("กรุณากรอกชื่อคณะ:");
        b = xx.nextLine();
        System.out.print("กรุณากรอกเงินเดือน :");
        c = xx.nextInt();
        System.out.print("กรุณากรอกชั่วโมงการสอน  :");
        d = xx.nextInt();

        if ( (d>=0 && d<12) )
            System.out.println(c);

        else if ( (d>=12 && d<=16) )
            System.out.println(c+(c*0.5));


        else if ( (d>=17 && d<=20) )
            System.out.println(c+(c*0.10));

        else if   ((d>=20 && d<=1000) )
            System.out.println((c+(c*0.15)));

        System.out.println(" ขอบคุณที่ใช้บริการ ");








    }//main







}//class
