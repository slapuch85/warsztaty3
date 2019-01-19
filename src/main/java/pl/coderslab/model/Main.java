package pl.coderslab.model;

import pl.coderslab.Exercise;
import pl.coderslab.Utils.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection()) {
            Exercise exercise = new Exercise("aaa", "aaa");
            exercise.saveToDB(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
