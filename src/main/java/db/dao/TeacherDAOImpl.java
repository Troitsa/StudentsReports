package db.dao;


import db.connectionManager.ConnectionManager;
import db.connectionManager.ConnectionManagerJDBCImpl;
import org.apache.log4j.Logger;
import pojo.Teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeacherDAOImpl implements TeacherDAO{
    private static final Logger logger = Logger.getLogger(StudentDAOImpl.class);
    private static ConnectionManager connectionManager = ConnectionManagerJDBCImpl.getInstance();
    @Override
    public void addTeacher(Teacher teacher) throws SQLException {
        Connection connection = connectionManager.getConnection();
        String sql = "INSERT INTO teacher (id,name,surname) VALUES (?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(3, teacher.getId());
        statement.setString(1, teacher.getName());
        statement.setString(2, teacher.getSurname());
        statement.executeUpdate();
        connection.close();
    }

    @Override
    public Teacher getTeacherById(int id) throws SQLException {
        Connection connection = connectionManager.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT * " +
                "FROM teacher WHERE id = ?");
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        Teacher teacher = null;
        if (resultSet.next()){
            teacher = new Teacher(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("surname"));
        }
        connection.close();
        return teacher;
    }

    @Override
    public void updateTeacher(Teacher teacher) throws SQLException {
        Connection connection = connectionManager.getConnection();
        String sql = "UPDATE teacher SET id = ?, name = ?, surname = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, teacher.getId());
        statement.setString(2, teacher.getName());
        statement.setString(3, teacher.getSurname());
        statement.executeUpdate();
        connection.close();
    }

    @Override
    public void deleteTeacherById(int id) throws SQLException {
        Connection connection = connectionManager.getConnection();
        String sql = "DELETE FROM teacher WHERE id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.executeUpdate();
        connection.close();
    }

    @Override
    public List<Teacher> getAllTeachers() throws SQLException {
        logger.info("Class TeacherDAOImpl method getAllTeachers started");
        Connection connection = connectionManager.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT * " +
                "FROM teacher");
        ResultSet resultSet = statement.executeQuery();
        ArrayList<Teacher> teachers = new ArrayList<>();
        while (resultSet.next()) {
            teachers.add(new Teacher(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("surname")));
        }
        connection.close();
        logger.info("Class TeacherDAOImpl method getAllTeachers finished");
        return teachers;
    }
}
