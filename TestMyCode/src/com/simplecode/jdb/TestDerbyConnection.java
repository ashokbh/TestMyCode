package com.simplecode.jdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class TestDerbyConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
            // connect method #1 - embedded driver
            //  connect method #2 - network client driver
            String dbURL2 = "jdbc:derby://localhost:1527/AshTest;create=true";
            String user = "user";
            String password = "password";
            Connection conn2 = DriverManager.getConnection(dbURL2, user, password);
            if (conn2 != null) {
                System.out.println("Connected to database #2 123");
                System.out.println("SOme more changes");
                System.out.println("SOme more third time changes");
                System.out.println("SOme more forth time changes");
                
                
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }


	}

}
