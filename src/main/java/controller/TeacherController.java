package controller;

import org.apache.log4j.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TeacherController extends HttpServlet {
    private static final Logger logger = Logger.getLogger(TeacherController.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Class TeacherController method doGet started");
        resp.setCharacterEncoding("UTF-8");
        req.getRequestDispatcher("/teachers.jsp").forward(req, resp);
        logger.info("Class TeacherController method doGet finished");
    }
}
