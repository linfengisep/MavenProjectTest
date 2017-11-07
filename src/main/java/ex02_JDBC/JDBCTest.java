package ex02_JDBC;
import java.sql.*;

public class JDBCTest {
/*
   static String url = "jdbc:mysql://localhost:8889/sakila";
   static String username = "root";
   static String password = "root";
*/

      static String url = null;
      static String username = null;
      static String password = null;
      static String sqlStatement = "UPDATE actor SET first_name ='julien' WHERE first_name = 'linfeng'";

      static Integer countRowAffected = 0;

   public static void main(String[] args){

      url=args[0];
      username=args[1];
      password=args[2];

      Connection conn = null;
      try{
         //step 1: allocate a database "Connection" object.
         conn = DriverManager.getConnection(url,username,password);
         //step 2: allocate a "Statement" object in the Connection.
         Statement stmt = conn.createStatement();
         //step 3: Execute a SQL SELECT query, the query result.

         String strSelect = sqlStatement;
         System.out.println("The SQL query is: "+strSelect);
         System.out.println();
         countRowAffected = stmt.executeUpdate(sqlStatement);
         /*
         ResultSet rset = stmt.executeQuery(strSelect);
         //step 4: Process the ResultSet using a cursor
         System.out.println("The records selected are :");
            int rowCount = 0;
            while(rset.next()){
            String name = rset.getString("first_name");
            System.out.println("first name is:= "+name);
            rowCount++;
         */
         System.out.println("Total number of affected row is = "+countRowAffected);
         }catch(SQLException e){
            e.printStackTrace();
         }catch(Exception ex){
            ex.printStackTrace();
         }finally{
            try{
               if(conn !=null)
                  conn.close();
               }catch(SQLException se){
               se.printStackTrace();
            }//end finnaly try
      }//end try
     }//end main
   }//end main
