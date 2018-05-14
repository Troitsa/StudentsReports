package service;

import db.dao.StudentDAO;
import db.dao.StudentDAOImpl;
import org.apache.log4j.Logger;

public class StudentsService {
    private static final Logger logger = Logger.getLogger(StudentsService.class);
    private static final Logger loggerError = Logger.getLogger(StudentsService.class);
    public StudentDAO studentDAO = new StudentDAOImpl();
}
