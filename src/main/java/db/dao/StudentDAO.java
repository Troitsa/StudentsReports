package db.dao;

import pojo.Student;
import java.sql.SQLException;
import java.util.List;

public interface StudentDAO {
    void addStudent(Student student) throws SQLException;
    Student getStudentById(int id) throws SQLException;
    void updateStudent(Student student) throws SQLException;
    void deleteStudentById(int id) throws SQLException;
    List<Student> getAllStudentsByGroupId(int id) throws SQLException;
}
