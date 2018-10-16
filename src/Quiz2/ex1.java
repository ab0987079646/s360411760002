package Quiz2;




import java.util.Scanner;

//ทรงกลม
// ทรงกระบอก
// กรวย
// ทรงพีระมิด
// ทรงปริซึม
public class ex1 {

    private static    final   double PT = 3.1414 ;
    private static Scanner sc = new Scanner(System.in);

    private static void Sphere (){
        double r,v;

        System.out.println("ป้อนค่ารัศมี (r) เป็นเซนติเมตร: ");
        r = sc.nextDouble();
        v = 4/3*PT* (r*r*r);
        System.out.println("ปริมาตวงกลม : " +v);

    }//Sphere





    public static void main(String[] args) {


        int select = 0;




         do {
             System.out.println("กรุณาเลือกรูปแบบที่คุณต้องการ");
             System.out.println("1.ทรงกลม");
             System.out.println("2.ทรงกระบอก");
             System.out.println("3.ทรงกรวย");
             System.out.println("4.ทรงพีระมิด");
             System.out.println("5.ทรงปริซึม");
             System.out.println("select:");

             select = sc.nextInt();


             switch (select) {
                 case 1:
                     Sphere();
                     break;
                 default:
                     System.out.println("กดใหม่"); break;

             }//switch

         } while ((select >= 1 ) && (select <= 6 ));








        }//main






































}//class
