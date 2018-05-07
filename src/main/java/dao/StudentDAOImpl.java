package dao;


import connectionManager.ConnectionManager;
import connectionManager.ConnectionManagerJDBCImpl;
import org.apache.log4j.Logger;
import pojo.Student;

import java.sql.*;

public class StudentDAOImpl implements StudentDAO{
    private static final Logger logger = Logger.getLogger(StudentDAOImpl.class);
    private static ConnectionManager connectionManager = ConnectionManagerJDBCImpl.getInstance();

    @Override
    public void addStudent(Student student) throws SQLException {
        logger.info("Class StudentDAOImpl method addStudent started");
        Connection connection = connectionManager.getConnection();
        String sql = "INSERT INTO student (id,name,surname,groups_id) VALUES (?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, student.getId());
        statement.setString(2, student.getName());
        statement.setString(3, student.getSurname());
        statement.setInt(4, student.getGroups_id());
        statement.executeUpdate();
        connection.close();
        logger.info("Class StudentDAOImpl method addStudent finished");
    }

    @Override
    public Student getStudentById(int id) throws SQLException {
        logger.info("Class StudentDAOImpl method getStudentById started");
        Connection connection = connectionManager.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT * " +
                "FROM student WHERE id = ?");
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        Student student = null;
        if (resultSet.next()){
            student = new Student(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("surname"),
                    resultSet.getInt("groups_id"));
        }
        connection.close();
        logger.info("Class StudentDAOImpl method getStudentById finished");
        return student;
    }

    @Override
    public void updateStudent(Student student) throws SQLException {
        logger.info("Class StudentDAOImpl method updateStudent started");
        Connection connection = connectionManager.getConnection();
        String sql = "UPDATE student SET id = ?, name = ?, surname = ?, groups_id  = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, student.getId());
        statement.setString(2, student.getName());
        statement.setString(3, student.getSurname());
        statement.setInt(4, student.getGroups_id());
        statement.executeUpdate();
        connection.close();
        logger.info("Class StudentDAOImpl method updateStudent finished");
    }

    @Override
    public void deleteStudentById(int id) throws SQLException {
        logger.info("Class StudentDAOImpl method deleteStudentById started");
        Connection connection = connectionManager.getConnection();
        String sql = "DELETE FROM student WHERE id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.executeUpdate();
        connection.close();
        logger.info("Class StudentDAOImpl method deleteStudentById finished");
    }
}
