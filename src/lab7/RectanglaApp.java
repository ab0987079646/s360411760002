package lab7;

public class RectanglaApp {

    public static void main(String[] args) {
        //create object

        Rectangie box1 = new Rectangie();


        box1 .setLength(5.0);
        box1.setWidth(5.0);

        System.out.println(box1.getLength());
        System.out.println(box1.getWidth());



        Rectangie box2 = new Rectangie(8.0 ,8.0);

        System.out.println(box2.getLength());
        System.out.println(box2.getWidth());



        System.out.println("Box :"+ box1.getArea());
        System.out.println("Box :"+ box2.getArea());






    }//main





}//class

