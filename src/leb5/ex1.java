package leb5;

public class ex1 {

    public static void main(String[] args) {



    int nomber [] ;

    nomber = new int[5] ;

    System.out.println(nomber[0]);
    System.out.println(nomber[1]);
    System.out.println(nomber[2]);
    System.out.println(nomber[3]);
    System.out.println(nomber[4]);


    nomber[3] = 100;

    System.out.println(nomber[3]);
    nomber[0]= nomber[3]  * 3;
    nomber[2]= nomber[0] -  nomber[3] ;

    System.out.println(nomber[0]);
    System.out.println(nomber[2]);












    }//main



}///class
