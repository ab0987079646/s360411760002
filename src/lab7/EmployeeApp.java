package lab7;

import java.util.Scanner;

public class EmployeeApp {

    public static void main(String[] args) {


        Employee emp1 = new Employee("Thaweesak" ,
                "Emp002",
                "Programmer",
                15000.00,
                "ab0987079646@gmail.com");





        System.out.println(emp1.toString());
        emp1.setName("thawwesak ratsadorn");
        System.out.println(emp1.toString());

        Employee emp2 = new Employee() ;


        inputdata (emp2);

System.out.println(emp2.toString());





    }//main

    private static void inputdata(Employee emp2) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name");
        emp2.setName(sc.nextLine());


        System.out.print("enter your id");
        emp2.setId(sc.nextLine());

        System.out.print("enter your position");
        emp2.setPosition(sc.nextLine());

        System.out.print("enter your salary");
        emp2.setSalary(sc.nextDouble());

        System.out.print("enter your email");
        emp2.setEmail(sc.nextLine());





    }


}//class
