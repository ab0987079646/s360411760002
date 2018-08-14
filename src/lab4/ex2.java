package lab4;


import java.util.Scanner;

//1. summation  (+)
//2. submation (-)
//3. multiope(*)
//4. Devision (/)
public class ex2 {


    public static int summation (int x,int y) {
        return x+y;
    }
    public static int  submation (int x,int y) {
        return x-y;
    }
    public static int multiope (int x,int y) {
        return x*y;
    }
    public static int Devision (int x,int y) {
        return x/y;
    }




    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x,y,select;

        System.out.println("Please input2 integers and choose your optiob.......");

        System.out.println("input numbar 1: ");
        x = input.nextInt();

        System.out.println("input numbar 2: ");
        y = input.nextInt();

        //show
        System.out.println("1. summation ");
        System.out.println("2. submation  ");
        System.out.println("3. multiope ");
        System.out.println("4. Devision ");


      do {
          System.out.println("Option: ");
          select = input.nextInt();
      }while (select<1 || select>4);






        int r=0;
        switch (select){

            case 1:r =summation(x,y); break;
            case 2:r = submation (x,y); break;
            case 3:r = multiope (x,y); break;
            case 4:r = Devision(x,y); break;

            default:System.out.println("plase select option (1-4) only");


        }

        System.out.println("optput : "+ r);









    }//main










}//class
