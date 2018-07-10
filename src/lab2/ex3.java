package lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex3 {

    public static void main(String[] args) throws IOException {


        // using BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));





        System.out.print("what is your name? : ");
        String name = reader.readLine();
        System.out.print("How own aer you? :");
        int age = Integer.parseInt(reader.readLine());

        //weigth
        System.out.print("how weigth? :");
        int weigth = Integer.parseInt(reader.readLine());


        //output
        System.out.println("hello, "+name);
        System.out.println("you are "+age+" years ola.");
        System.out.println("weigth "+weigth+"" );
















    }//





}//class
