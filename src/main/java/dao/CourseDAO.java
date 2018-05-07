package dao;

import pojo.Course;

import java.sql.SQLException;

public interface CourseDAO {
    public void addCourse(Course course) throws SQLException;
    public Course getCourseById(int id) throws SQLException;
    public void updateCourse(Course course) throws SQLException;
    public void deleteCourseById(int id) throws SQLException;
}
