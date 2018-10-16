package leb10;

import java.sql.*;


public class mydatabaseDamo {


    public Connection connect() {

        String path = "jdbc:sqlite:D:\\s360411760002\\src\\leb10\\mydaatabase.db" ;
        Connection conn = null ;
        try {
            conn = DriverManager.getConnection(path) ;
            System.out.println("Database is Connected");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Can t connect to Database. ");
        }
        return conn ;

    }//connect


    private void  readData () {
        String sql = "select * from students";
        try {
            Connection conn = this.connect();
            Statement stmt = conn.createStatement() ;
            ResultSet  rs = stmt.executeQuery(sql);

            //loop
            while (rs.next()){
                System.out.println(rs.getInt("id")+"\t"+
                        rs.getString("fistname"+"\t")+
                        rs.getString("lastname")+"\t"+
                        rs.getInt("age"));
            }




            } catch (SQLException e) {
            e.printStackTrace();
        }


    }//readData



    public static void main(String[] args) {


                      mydatabaseDamo mydb = new mydatabaseDamo();

                     mydb.readData();


    }//main




}//class
