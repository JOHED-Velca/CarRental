package CarRental;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Rental {
    static Scanner scanner = new Scanner(System.in);


    public static void main (String[] args) {

        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/fortrandb",
                    "root",
                    "Eresunvago1.");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM USERS");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("username"));
                System.out.println(resultSet.getString("password"));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

        Display display = new Display();
        while (true) {
            display.MainMenu();
            int option = display.GetOption();
            display.OptionChosen(option);
        }
    }
}
