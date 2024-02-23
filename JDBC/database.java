import java.sql.*;
import java.util.Scanner;

class Database {
    public static void main(String[] args) {
        //getData();
       // insertData();
       //deleteData();
       get_from_user();
    }

    public static Connection getConnection() {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String databaseUrl = "jdbc:mysql://localhost:3306/roshandb";
            String username = "root";
            String password = "roshan";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(databaseUrl, username, password);
            System.out.println("Database Connected");
            return conn;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
    }

    public static void getData() {
        try {
            Statement statement = getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM roshan_table");

            while (result.next()) {
                System.out.println(result.getString("id"));
                System.out.println(result.getString("name"));
                System.out.println(result.getString("address"));
                System.out.println(result.getString("phone"));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void insertData() {
        try {
            Statement statement = getConnection().createStatement();
            int result = statement.executeUpdate("INSERT INTO roshan_table (id, name, address, ph_no) VALUES (1, 'roshan', 'dhapakhel', '9865314672')");
            System.out.println(result);
            if (result == 1) {
                System.out.println("Data Inserted");
            } else {
                System.out.println("Some error");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void deleteData() {
        try {
            Statement statement = getConnection().createStatement();
            int result = statement.executeUpdate("DELETE FROM roshan_table WHERE id = 1");
            if (result == 1) {
                System.out.println("Record Deleted");
            } else {
                System.out.println("Some error");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }


    public static void get_from_user(){
        try {
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter the id:");
            int id=scan.nextInt();
            Statement statement=getConnection().createStatement();

            ResultSet result=statement.executeQuery("Select * from roshan_table where id= "+id);

            while(result.next()){
                System.out.println(result.getString("id"));
                System.out.println(result.getString("name"));
                System.out.println(result.getString("address"));
                System.out.println(result.getString("ph_no"));
            }
        }
        catch (Exception e){
            System.out.println("Error" +e);
        }
    }
}
