package dao;

import pojo.Teacher;

import java.sql.SQLException;

public interface TeacherDAO {
    public void addTeacher(Teacher teacher) throws SQLException;
    public Teacher getTeacherById(int id) throws SQLException;
    public void updateTeacher(Teacher teacher) throws SQLException;
    public void deleteTeacherById(int id) throws SQLException;
}
