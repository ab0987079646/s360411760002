package leb5;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ex_3 {

    public static void main(String[] args) {

    int num [][] = new  int[2][3] ; //2 rows and 3 columns = 6 elements


     num =   inputData (num);


     //show output

        showData (num) ;



        //sortArray
        sortArray (num);






    }//main

    private static void sortArray(int[][] num) {

        Arrays.sort(num);
        System.out.println("sortind Data: ");
        showData(num);

    }





    private static void showData(int[][] num) {

   System.out.println("Data in array : ");

        for (int i = 0; i < num.length ; i++) {
            for (int j = 0; j < num [i].length; j++) {

                System.out.print(num[i][j]+" ");
            }//j
            System.out.println();




        }



    }






    private static int[][] inputData(int[][] num) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length  ; i++) {

            for (int j = 0; j < num[i].length ; j++) {


                System.out.print("enter integers");

                num [i] [j] = sc.nextInt();
            }


        }//i


        return num;
    }



}//class
