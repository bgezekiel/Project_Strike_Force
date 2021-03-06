// Author: Chris Potvin
// Co-Author: Ethan Shipley
// Date: May 1st, 2019
// About: This is a customer object where the SQL query is refactored from the main controller class.

package sample.Model;

import sample.DBConnect;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerDB {
    public static void insertCustomer(Customer cust){

        try {
            Connection conn = DBConnect.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("insert into customers(CustFirstName, CustLastName, CustAddress, CustCity, CustProv, CustPostal, CustCountry, CustHomePhone, CustBusPhone, CustEmail) "
                    + "VALUES ('" + cust.getCustFirstName() + "','" + cust.getCustLastName() + "','" + cust.getCustAddress()
                    + "','" + cust.getCustCity() + "','" + cust.getCustProv() + "','" + cust.getCustPostal() +
                    "','" + cust.getCustCountry() + "','" + cust.getCustHomePhone() + "','" + cust.getCustBusPhone() + "','" + cust.getCustEmail() + "')");

            JOptionPane.showMessageDialog(null, "New Customer Record Added");
            /*clear();
            getCustomerSearch();*/

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }

}
