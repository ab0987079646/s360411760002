package lab3;

import java.util.Scanner;

public class BMRCal {


    public static void main(String[] args) {



        Scanner xx = new Scanner(System.in);




        System.out.println(" เพศ ");
        String g = xx.nextLine();

        System.out.println(" ส่วนสูง ");
        int h = xx.nextInt();

        System.out.println(" นํ้าหนัก ");
        int w = xx.nextInt();

        System.out.println(" อายุ ");
        int a = xx.nextInt();

         if (g=="ชาย")
        System.out.println(66+(13.7*w)+(5*h)-(6.8*a)); //ชาย
        else
        System.out.println(655+(9.6*w)+(1.8*h)-(4.7*a)); //  หญิง




















    }

}//clall