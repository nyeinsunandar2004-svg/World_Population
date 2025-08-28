package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main_two {

    // Connection
    // Statement / Prepared statement
    // Resultset (int 1 ka sa dl)

    private Connection getConnection(String ipaddress, int portno, String dbname, String username, String password)
    { // connection yway yin Java.con pl phyit ya
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://" + ipaddress + ":" + portno + "/" + dbname, username, password);
            System.out.println("Connected to database successfully");

        }catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args) {
            Main_two m = new Main_two();
            Connection con = m.getConnection("localhost", 3306, "world_population", "root", "");
    }
}
