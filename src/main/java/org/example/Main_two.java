package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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

    protected ArrayList<country>read_DB(Connection con){
        ArrayList<country> countrylist = new ArrayList<>();
        try{
            PreparedStatement state = con.prepareStatement("SELECT country_name, capital_name, " +
                    "region_name, sub_region_name FROM population");
            ResultSet rs = state.executeQuery();
            while(rs.next()){
                countrylist.add(new country(rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4)));
            }
            rs.close();
            state.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return countrylist;
    }

    public static void main(String[] args) {
            Main_two m = new Main_two();
            Connection con = m.getConnection("localhost", 3306, "world_population", "root", "");
            ArrayList<country> countrylist = m.read_DB(con);
            System.out.println(countrylist.getLast());

            try{
                con.close();
            }catch(Exception e){
                e.printStackTrace();
            }
    }
}
