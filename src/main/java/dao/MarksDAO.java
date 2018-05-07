package dao;



import pojo.Lecture;
import pojo.Marks;
import pojo.Student;

import java.sql.SQLException;
import java.util.ArrayList;

public interface MarksDAO {
    public void addMark(Student student, Lecture lecture, int mark) throws SQLException;
    public ArrayList<Marks> getMarksByStudentId(int id) throws SQLException;
    public ArrayList<Marks> getMarksByLectureId(int id) throws SQLException;
    public void updateMark(Marks marks) throws SQLException;
    public void deleteMarksById(int id) throws SQLException;
}
