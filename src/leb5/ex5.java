package leb5;

public class ex5 {
    public static void main(String[] args) {
    String msg1 = "Hello"  ;
    //inegth() ;

        System.out.println(msg1.length());
        System.out.println("*"+msg1 + "*");
        System.out.println("*"+ msg1.trim()+"*");
        System.out.println( msg1.toUpperCase());



        //compar String

        String msg2 = "MIT421";
        String msg3 = "MIT421";
        String msg4 = "MT MIT421";

        //==

        if (msg2 == msg3)
            System.out.println("yes");
        else System.out.println("no");
        if (msg3==msg4)
            System.out.println("yes");
        else   System.out.println("no");


        //quals()

        if (msg2.equals(msg3))
            System.out.println("yes");
        else System.out.println("no");

        if (msg3.equals(msg4))
            System.out.println("yes");
        else System.out.println("no");



        //compareto

        if (msg2.compareTo(msg4)==0)
            System.out.println("2 string are equal.");

        else if (msg2.compareTo(msg3)>=1)
            System.out.println("msg2 more than msg3");

        else System.out.println("msg2 less than msg3");












    }//main



}//class




