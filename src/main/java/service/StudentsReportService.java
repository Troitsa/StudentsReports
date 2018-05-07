package service;

import dao.MarksDAO;
import dao.MarksDAOImpl;
import dao.StudentDAO;
import dao.StudentDAOImpl;
import org.apache.log4j.Logger;
import pojo.Marks;
import pojo.Student;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentsReportService {
    private static final Logger logger = Logger.getLogger(StudentsReportService.class);
    private static final Logger loggerError = Logger.getLogger(StudentsReportService.class);
    public MarksDAO marksDAO = new MarksDAOImpl();
    public StudentDAO studentDAO = new StudentDAOImpl();

    public Student getStudentById(int id) {
        logger.info("Class StudentsReportService method getStudentById started");
        Student student = null;
        try {
            student = studentDAO.getStudentById(id);
        } catch (SQLException e) {
            loggerError.error("Error at method getStudentById", e);
        }
        logger.info("Class StudentsReportService method getStudentById finished");
        return student;
    }

    public ArrayList<Marks> getMarksByStudentId(int id) {
        logger.info("Class StudentsReportService method getMarksByStudentId  started");
        ArrayList<Marks> marksList = null;
        try {
            marksList = marksDAO.getMarksByStudentId(id);
        } catch (SQLException e) {
            loggerError.error("Error at method getMarksByStudentId", e);
        }
        logger.info("Class StudentsReportService method getMarksByStudentId  finished");
        return marksList;
    }

}
