package controller;

import org.apache.log4j.Logger;
import service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StudentController extends HttpServlet {
    private static final Logger logger = Logger.getLogger(StudentController.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Class StudentController method doGet started");
        resp.setCharacterEncoding("UTF-8");
        req.getRequestDispatcher("/student.jsp").forward(req, resp);
        logger.info("Class StudentController method doGet finished");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentService studentService = new StudentService();
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        int group_id = Integer.parseInt(req.getParameter("group_id"));
        studentService.updateStudentById(id,name,surname,group_id);
        resp.sendRedirect("/student-report.jsp?studentId="+id);
    }
}
