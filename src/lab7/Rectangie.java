package lab7;

public class Rectangie {

       private double length ;
       private double width ;
       //constructor
    //drfauit contructor
    public Rectangie () {}
    public Rectangie  (double length , double width) {

        this.length = length;
        this.width = width ;

    }
   //getter amd stter methods
    // get => read
    // set => edit

    public  double getLength () {
        return this.length;
    }

    public  void setLength (double length) {

        this.length = length ;
    }


    public  double getWidth () {
        return this.width ;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea () {
        return  this.length * this.width ;

    }



}//class
