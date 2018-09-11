package leb5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner (System.in) ;

        int[]num = new int[5];

        System.out.println("please , enter integers nomber ");
        for (int i = 0; i  < num.length;i++) {
           System.out.println("enter integer " +(i+1)+ ":" );
          num[i] = scanner.nextInt();

       }


        //System.out.println("\n data in array following: ");
        //for (int i = 0; i < num.length; i++) {

          //  System.out.print(num[i]+" ");
        //}










        Showdata (num); ;

        aa (num) ;
        bb (num);
        cc (num);
        dd (num);













    }//main


    private static void dd(int[] num) {
        Arrays.sort(num);
        System.out.println("sorting data : \n");
        Showdata(num);










    }//4

    private static void cc(int[] num) {

      int x = 0 ;
      for (int a : num ) {
          x += a ;

      }

      System.out.println("\n ผลเฉลี่ย: " +(x/num.length));





    }//3




    private static void bb(int[] num) {

   int x = num[0];

   for (int a = 0; a< num.length;  a++) {

       if (x > num [a])
           x = num[a] ;

       }

       System.out.print("\nค่าที่น้อย:" + x);







    }//2

    private static void aa(int[] num) {

        int max = num [0];
        for (int i = 0; i< num .length; i++) {

          if (max < num [i])
              max = num [i] ;
        }
        System.out.print("\nค่าที่มากคือ: "+max);

    }//1




    private static void Showdata(int[] num) {


        for (int val : num ){
            System.out.print(val+" ");
        }




    }






}//class
