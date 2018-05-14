package db.dao;



import db.connectionManager.ConnectionManager;
import db.connectionManager.ConnectionManagerJDBCImpl;
import org.apache.log4j.Logger;
import pojo.Lecture;
import pojo.Marks;
import pojo.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MarksDAOImpl implements MarksDAO{
    private static final Logger logger = Logger.getLogger(MarksDAOImpl.class);
    private static ConnectionManager connectionManager = ConnectionManagerJDBCImpl.getInstance();
    @Override
    public void addMark(Student student, Lecture lecture, int mark) throws SQLException {
        logger.info("Class MarksDAOImpl method addMark started");
        Connection connection = connectionManager.getConnection();
        String sql = "INSERT INTO marks (id,student_id,lecture_id,mark) VALUES (?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, student.getId());
        statement.setInt(2, lecture.getId());
        statement.setInt(3, mark);
        statement.executeUpdate();
        connection.close();
        logger.info("Class MarksDAOImpl method addMark finished");
    }

    @Override
    public List<Marks> getMarksByStudentId(int id) throws SQLException {
        return getMarksById(id,"student");
    }

    @Override
    public List<Marks> getMarksByLectureId(int id) throws SQLException {
        return getMarksById(id,"lecture");
    }

    @Override
    public void updateMark(Marks marks) throws SQLException {
        logger.info("Class MarksDAOImpl method updateMark started");
        Connection connection = connectionManager.getConnection();
        String sql = "UPDATE marks SET id = ?, student_id = ?, lecture_id=?, marks=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, marks.getId());
        statement.setInt(2, marks.getStudentId());
        statement.setInt(3, marks.getLectureId());
        statement.setInt(4, marks.getMark());
        statement.executeUpdate();
        connection.close();
        logger.info("Class MarksDAOImpl method updateMark finished");
    }

    @Override
    public void deleteMarksById(int id) throws SQLException {
        logger.info("Class MarksDAOImpl method deleteMarksById started");
        Connection connection = connectionManager.getConnection();
        String sql = "DELETE FROM marks WHERE id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.executeUpdate();
        connection.close();
        logger.info("Class MarksDAOImpl method deleteMarksById finished");
    }

    public List<Marks> getMarksById(int id, String byWhat) throws SQLException {
        logger.info("Class MarksDAOImpl method getMarksById started");
        Connection connection = connectionManager.getConnection();
        PreparedStatement statement = null;
        ArrayList<Marks> marks = new ArrayList<>();
        if (byWhat.equals("lecture")) {
            statement = connection.prepareStatement("SELECT * " +
                    "FROM marks WHERE lecture_id = ?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                marks.add(new Marks(
                        resultSet.getInt("id"),
                        resultSet.getInt("student_id"),
                        resultSet.getInt("lecture_id"),
                        resultSet.getInt("mark")));
            }
        } else {
            statement = connection.prepareStatement("SELECT marks.id, lecture.date, lecture.title, mark " +
                    "FROM marks JOIN lecture ON marks.lecture_id = lecture.id " +
                    "WHERE student_id = ?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                marks.add(new Marks(
                        resultSet.getInt("id"),
                        resultSet.getString("date"),
                        resultSet.getString("title"),
                        resultSet.getInt("mark")));
            }
        }
        connection.close();
        logger.info("Class MarksDAOImpl method getMarksById finished");
        return marks;
    }
}
