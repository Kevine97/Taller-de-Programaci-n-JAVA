/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sysInventario.DAL;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ara-PC
 */
public class Dbconnection {

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/sysinventariodb"
                    +"?useUnicode=true"
                    +"&useJDBCComplianTimeZoneShift=true"
                    +"useLegacyDatetimeCode=false"
                    +"&serverTimezone=UTC",
                    "root", "upoli123");
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

    }

}
