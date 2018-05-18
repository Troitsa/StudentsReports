package service;

import db.dao.TeacherDAO;
import db.dao.TeacherDAOImpl;
import org.apache.log4j.Logger;
import pojo.Teacher;
import java.sql.SQLException;
import java.util.List;

public class TeacherService {
    private static final Logger logger = Logger.getLogger(TeacherService.class);
    private static final Logger loggerError = Logger.getLogger(TeacherService.class);
    private TeacherDAO teacherDAO = new TeacherDAOImpl();

    public List<Teacher> getAllTeachers() {
        logger.info("Class getAllTeachers method getAllTeachers started");
        List<Teacher> teachers = null;
        try {
            teachers = teacherDAO.getAllTeachers();
        } catch (SQLException e) {
            loggerError.error("Error at method getAllTeachers", e);
        }
        logger.info("Class getAllTeachers method getAllTeachers finished");
        return teachers;
    }
}
