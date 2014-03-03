
package com.tn.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
 private static final String driver="com.mysql.jdbc.Driver";
 private static final  String url = "jdbc:mysql://localhost:3306/covoiturage";
   private static final  String login = "root";
   private static final  String pwd = "";
   private static Connection con;   
    private MyConnection(){
        System.out.println("Connexion Etablie");
    }
    public Connection etablirConnection(){
        try {
            Class.forName(driver);
            con= DriverManager.getConnection(url,login,pwd);
            System.out.println("--------- CNX Etablie---------");
            
        } catch (ClassNotFoundException e) {System.out.println("Erreur de chargement de driver"+e.getMessage());}
          catch(SQLException ex){
              System.out.println("probleme de connexion "+ex.getLocalizedMessage()); }
   return con;
    }
    public static  Connection getInstance(){
        if(con==null)
            new MyConnection().etablirConnection();
        return con;
    }
}
