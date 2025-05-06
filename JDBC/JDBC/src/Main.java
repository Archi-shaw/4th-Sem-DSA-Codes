import java.sql.*;

public class Main {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/my_new_database"; 
        String user = "root";
        String password = "Archi@2004";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            String insertQuery = "INSERT INTO employees (name, salary) VALUES (?, ?)";
            PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
            insertStmt.setString(1, "Archi Shaw");
            insertStmt.setDouble(2, 55000);
            insertStmt.executeUpdate();
            System.out.println("Data inserted successfully!");

            String selectQuery = "SELECT * FROM employees";
            Statement selectStmt = conn.createStatement();
            ResultSet rs = selectStmt.executeQuery(selectQuery);

            System.out.println("\nEmployee Records:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");
                System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
            }

            rs.close();
            insertStmt.close();
            selectStmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
