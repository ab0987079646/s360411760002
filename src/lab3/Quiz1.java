package lab3;

public class Quiz1{
    public static void main(String[] args) {

              int count = 0;
              int j = 0;
        for (int x=500; x<=1000; x++) {
            //statement fpr
            if (x % 3 == 0 && x % 6 == 0)
            {
                System.out.print(x + " ");


                count++;
                j+=x;//
            }

        }




        System.out.print("\nnumber of is"+count );
        System.out.print("\nผมรวม"+j);
        System.out.print("\nผลหาร"+(j/count));

































    }//mail










}//call

