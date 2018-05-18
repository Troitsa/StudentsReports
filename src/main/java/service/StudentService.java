package service;

import db.dao.MarksDAO;
import db.dao.MarksDAOImpl;
import db.dao.StudentDAO;
import db.dao.StudentDAOImpl;
import org.apache.log4j.Logger;
import pojo.Marks;
import pojo.Student;
import java.sql.SQLException;
import java.util.List;


public class StudentService {
    private static final Logger logger = Logger.getLogger(StudentService.class);
    private static final Logger loggerError = Logger.getLogger(StudentService.class);
    private StudentDAO studentDAO = new StudentDAOImpl();
    private MarksDAO marksDAO = new MarksDAOImpl();

    public Student getStudentById(int id) {
        logger.info("Class StudentService method getStudentById started");
        Student student = null;
        try {
            student = studentDAO.getStudentById(id);
        } catch (SQLException e) {
            loggerError.error("Error at method getStudentById", e);
        }
        logger.info("Class StudentService method getStudentById finished");
        return student;
    }


    public List<Marks> getMarksByStudentId(int id) {
        logger.info("Class StudentService method getMarksByStudentId  started");
        List<Marks> marksList = null;
        try {
            marksList = marksDAO.getMarksByStudentId(id);
        } catch (SQLException e) {
            loggerError.error("Error at method getMarksByStudentId", e);
        }
        logger.info("Class StudentService method getMarksByStudentId  finished");
        return marksList;
    }

    public void updateStudentById(int id, String name, String surname, int group_id) {
        logger.info("Class StudentService method updateStudentById started");
        Student student = new Student(id, name, surname, group_id);
        try {
            studentDAO.updateStudent(student);
        } catch (SQLException e) {
            loggerError.error("Error at method updateStudentById", e);
        }
        logger.info("Class StudentService method updateStudentById finished");
    }
}
