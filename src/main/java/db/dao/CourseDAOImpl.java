package db.dao;



import db.connectionManager.ConnectionManager;
import db.connectionManager.ConnectionManagerJDBCImpl;
import org.apache.log4j.Logger;
import pojo.Course;

import java.sql.*;
import java.util.ArrayList;

public class CourseDAOImpl implements CourseDAO{
    private static final Logger logger = Logger.getLogger(StudentDAOImpl.class);
    private static ConnectionManager connectionManager = ConnectionManagerJDBCImpl.getInstance();
    @Override
    public void addCourse(Course course) throws SQLException {
        Connection connection = connectionManager.getConnection();
        String sql = "INSERT INTO course (id,title) VALUES (?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, course.getId());
        statement.setString(2, course.getTitle());
        statement.executeUpdate();
    }

    @Override
    public Course getCourseById(int id) throws SQLException {
        Connection connection = connectionManager.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT * " +
                "FROM course WHERE id = ?");
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        Course course = null;
        if (resultSet.next()){
            course = new Course(
                    resultSet.getInt("id"),
                    resultSet.getString("title"));
        }
        connection.close();
        return course;
    }

    @Override
    public void updateCourse(Course course) throws SQLException {
        Connection connection = connectionManager.getConnection();
        String sql = "UPDATE group SET id = ?, title = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, course.getId());
        statement.setString(2, course.getTitle());
        statement.executeUpdate();
        connection.close();
    }

    @Override
    public void deleteCourseById(int id) throws SQLException {
        Connection connection = connectionManager.getConnection();
        String sql = "DELETE FROM course WHERE id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.executeUpdate();
        connection.close();
    }

    @Override
    public ArrayList<Course> getAllCourses() throws SQLException {
        logger.info("Class CourseDAOImpl method getAllCourses started");
        Connection connection = connectionManager.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT * " +
                "FROM course");
        ResultSet resultSet = statement.executeQuery();
        ArrayList<Course> courses = new ArrayList<>();
        while (resultSet.next()) {
            courses.add(new Course(
                    resultSet.getInt("id"),
                    resultSet.getString("title")));
        }
        connection.close();
        logger.info("Class CourseDAOImpl method getAllCourses finished");
        return courses;
    }
}
