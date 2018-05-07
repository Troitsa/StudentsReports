package dao;



import pojo.Student;

import java.sql.SQLException;

public interface StudentDAO {
    public void addStudent(Student student) throws SQLException;
    public Student getStudentById(int id) throws SQLException;
    public void updateStudent(Student student) throws SQLException;
    public void deleteStudentById(int id) throws SQLException;
}
