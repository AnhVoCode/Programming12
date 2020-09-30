package Database;

import org.apache.derby.iapi.db.Database;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DatabaseHandler {
    private static final String DB_url = "jdbc:derby:database/forum;create=true";
    private static Connection connection = null;
    private static Statement statement = null;

    public DatabaseHandler(){
        createConnection();
    }

    private void createConnection() {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            connection = DriverManager.getConnection(DB_url);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void createStudentTable(){
        String TABLE_NAME = "STUDENT";
        try{
            statement = connection.createStatement();
            DatabaseMetaData data = connection.getMetaData();
            ResultSet table = data.getTables(null,null,TABLE_NAME,null);
            if(table.next()){
                System.out.println("Table: "+ TABLE_NAME + " already exists");
            }
            else {
                String statement = "CREATE TABLE " + TABLE_NAME + "("


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean execAction(String query) {
        try {
            statement = connection.createStatement();
            statement.execute(query);
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"ERROR: "
                    + e.getMessage()," ERROR OCCURRED", JOptionPane.ERROR_MESSAGE);
            System.out.println("Exception at exeQuery "+ e.getLocalizedMessage());
            return false;
        }
    }
    public ResultSet execQuery(String query){
        ResultSet resultSet;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("Exception at Execute Query");
            return null;
        }
        return resultSet;
    }
}
