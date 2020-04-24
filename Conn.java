/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;
import java.sql.*;
/**
 *
 * @author dinesh
 */
public class Conn {
    
    public Connection c;
    public Statement s;
    
    public Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///project","root","");
            s=c.createStatement();
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
