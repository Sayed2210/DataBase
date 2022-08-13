import java.sql.*;

public class Test {
    public static void connection(){
        try {
            Connection c= DriverManager.getConnection(
                    "jdbc:mysql://localhost/student?serverTimezone=UTC",
                    "ElsayedPaplo",
                    "Elsayed123456"
            );
            System.out.println("Done");
            Statement s=c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet r=s.executeQuery("SELECT 'Id' ,'FirstName','LastName','City' FROM info");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
