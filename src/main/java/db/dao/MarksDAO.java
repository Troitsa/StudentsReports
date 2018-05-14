package db.dao;

import pojo.Lecture;
import pojo.Marks;
import pojo.Student;
import java.sql.SQLException;
import java.util.List;

public interface MarksDAO {
    void addMark(Student student, Lecture lecture, int mark) throws SQLException;
    List<Marks> getMarksByStudentId(int id) throws SQLException;
    List<Marks> getMarksByLectureId(int id) throws SQLException;
    void updateMark(Marks marks) throws SQLException;
    void deleteMarksById(int id) throws SQLException;
}
