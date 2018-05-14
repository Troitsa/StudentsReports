package db.dao;

import pojo.Teacher;
import java.sql.SQLException;
import java.util.List;

public interface TeacherDAO {
    void addTeacher(Teacher teacher) throws SQLException;
    Teacher getTeacherById(int id) throws SQLException;
    void updateTeacher(Teacher teacher) throws SQLException;
    void deleteTeacherById(int id) throws SQLException;
    List<Teacher> getAllTeachers() throws SQLException;
}
