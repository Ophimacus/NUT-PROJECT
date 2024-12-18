/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafemanagementsystem;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author thanf
 */
public class cafeconnector {
    public static Connection DBConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "");
            return con;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
