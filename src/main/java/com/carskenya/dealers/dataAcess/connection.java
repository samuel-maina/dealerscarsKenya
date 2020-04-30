/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carskenya.dealers.dataAcess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samuel
 */
public class connection {
  public static Connection getConnection(){
      try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/carproductske","samuel","7924");
        return conn;
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
          Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
      }
      return null;
  
  }  
}
