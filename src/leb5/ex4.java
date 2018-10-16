package leb5;

import java.util.ArrayList;

public class ex4 {

    public static void main(String[] args) {


        ArrayList mylins  = new  ArrayList  () ;
        mylins.add("j");
        System.out.println(mylins);
        mylins.add("bots");
        mylins.add("mook");
        mylins.add("may");
        mylins.add("kiw");
        mylins.add("swwis");

        System.out.println(mylins);

        mylins.add(2," j");
        System.out.println(mylins);

        //remove

        mylins.remove(4);
        System.out.println(mylins);
        mylins.remove("may");
        System.out.println(mylins);



        //indexof ()

        System.out.println(mylins.indexOf("bots"));

        //size
        System.out.println(mylins.size());



    }//main


}//class


