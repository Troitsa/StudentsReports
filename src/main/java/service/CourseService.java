package service;

import db.dao.CourseDAO;
import db.dao.CourseDAOImpl;
import org.apache.log4j.Logger;
import pojo.Course;
import java.sql.SQLException;
import java.util.List;

public class CourseService {
    private static final Logger logger = Logger.getLogger(StudentsService.class);
    private static final Logger loggerError = Logger.getLogger(GroupsService.class);
    private CourseDAO courseDAO = new CourseDAOImpl();

    public List<Course> getAllCourses() {
        logger.info("Class getAllTeachers method getAllTeachers started");
        List<Course> courses = null;
        try {
            courses = courseDAO.getAllCourses();
        } catch (SQLException e) {
            loggerError.error("Error at method getAllTeachers", e);
        }
        logger.info("Class getAllTeachers method getAllTeachers finished");
        return courses;
    }
}
