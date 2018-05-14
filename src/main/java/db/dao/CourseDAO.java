package db.dao;

import pojo.Course;
import java.sql.SQLException;
import java.util.List;

public interface CourseDAO {
    void addCourse(Course course) throws SQLException;
    Course getCourseById(int id) throws SQLException;
    void updateCourse(Course course) throws SQLException;
    void deleteCourseById(int id) throws SQLException;
    List<Course> getAllCourses() throws SQLException;
}
