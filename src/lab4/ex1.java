package lab4;

public class ex1 {


    public static void B (String msg) {

        System.out.println(msg);
        //clla A

        A();

    }//B



    public static void main(String[] args) {

             System.out.println("hello Main.");
             //call A()
        A();
        System.out.println("hello Main.2");

        //clla B
        B("jj");


        //call C
       int num = C (10,10);//20

        System.out.println(num);
        System.out.println(C(20,20));
    }//main

    public static void A (){
        //method body
        System.out.println("hello A.");



    }

    public static int C(int X , int Y){

        System.out.println("Hllo C");
        return X+Y;




    }//C












}//class



