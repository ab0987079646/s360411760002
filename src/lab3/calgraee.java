package lab3;

import java.util.Scanner;

public class calgraee {    public static void main(String[] args) {

      Scanner rock =new Scanner(System.in);

      int testScore;

        do {
            System.out.println("คะแนน");
            testScore = rock.nextInt();

            if (testScore < 49)
                System.out.println("f");
            else if (testScore >= 50 && testScore <= 54)
                System.out.println("D");

            else if (testScore >= 55 && testScore <= 59)
                System.out.println("D+");
            else if (testScore >= 60 && testScore <= 64)
                System.out.println("C");
            else if (testScore >= 65 && testScore <= 69)
                System.out.println("C+");
            else if (testScore >= 70 && testScore <= 74)
                System.out.println("B");
            else if (testScore >= 75 && testScore <= 79)
                System.out.println("B+");
            else if (testScore >= 80 && testScore < 100)
                System.out.println("A");

            else {
                System.out.println("กรอก0-100");


            }

        }while (testScore>100 || testScore<0);























    }//main







}//class
