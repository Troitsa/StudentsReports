package controller;

import org.apache.log4j.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StudentsReportController extends HttpServlet {
    private static final Logger logger = Logger.getLogger(StudentsReportController.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Class StudentsReportController method doGet started");

        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        req.getRequestDispatcher("/student-report.jsp").forward(req, resp);
        logger.info("Class StudentsReportController method doGet finished");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        logger.info("Class StudentsReportController method doPost started");
        logger.info("Class StudentsReportController method doPost finished");
    }
}