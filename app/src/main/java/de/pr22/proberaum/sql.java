package de.pr22.proberaum;

import android.os.StrictMode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class sql {
    Map mapSQL = new HashMap();
    public Map sqlSelect() {

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception e) {
            System.err.println("Cannot create connection");
        }
        try {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
            Connection connection = null;
            connection = DriverManager.getConnection("jdbc:mysql://ip:3306/db", "user", "pw");
            Statement statement = connection.createStatement();

            String query = "SELECT bezeichnung, wert FROM tbl_lichter";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                String bezeichnung = rs.getString("bezeichnung");
                String wert = rs.getString("wert");
                mapSQL.put(bezeichnung, wert);
                //System.err.println(bezeichnung + " " + wert);
            }
            connection.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        return mapSQL;
    }
}
