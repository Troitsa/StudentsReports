package service;

import db.dao.GroupDAO;
import db.dao.GroupDAOImpl;
import db.dao.StudentDAO;
import db.dao.StudentDAOImpl;
import org.apache.log4j.Logger;
import pojo.Group;
import pojo.Student;
import java.sql.SQLException;
import java.util.List;

public class GroupsService {
    private static final Logger logger = Logger.getLogger(GroupsService.class);
    private static final Logger loggerError = Logger.getLogger(GroupsService.class);
    private GroupDAO groupDAO = new GroupDAOImpl();
    private StudentDAO studentDAO = new StudentDAOImpl();

    public List<Group> getAllGrops() {
        logger.info("Class GroupsService method getAllGrops  started");
        List<Group> groupsList = null;
        try {
            groupsList = groupDAO.getAllGroups();
        } catch (SQLException e) {
            loggerError.error("Error at method getAllGrops", e);
        }
        logger.info("Class GroupsService method getAllGrops finished");
        return groupsList;
    }


    public List<Student> getAllStudentsByGroupId(int id) {
        logger.info("Class StudentsService method getAllStudentsByGroupId started");
        List<Student> students = null;
        try {
            students = studentDAO.getAllStudentsByGroupId(id);
        } catch (SQLException e) {
            loggerError.error("Error at method getAllStudentsByGroupId", e);
        }
        logger.info("Class StudentsService method getAllStudentsByGroupId finished");
        return students;
    }
}
