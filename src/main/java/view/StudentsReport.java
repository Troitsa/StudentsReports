package view;

import org.apache.log4j.Logger;
import pojo.Marks;
import pojo.Student;
import service.StudentsReportService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class StudentsReport extends HttpServlet {
    private static final Logger logger = Logger.getLogger(StudentsReport.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Class StudentsReport method doGet started");
        resp.setCharacterEncoding("UTF-8");
        StringBuilder result = new StringBuilder();
        String studentId = req.getParameter("studentId");
        StudentsReportService studentsReportService = new StudentsReportService();
        Student student = studentsReportService.getStudentById(Integer.parseInt(studentId));
        ArrayList<Marks> marks = studentsReportService.getMarksByStudentId(Integer.parseInt(studentId));
        result.append(student.getName()).append(" ").append(student.getSurname());
        result.append(System.lineSeparator());
        for(Marks mark : marks) {
            result.append(mark.getDate());
            result.append("  ");
            result.append(mark.getMark());
            result.append(System.lineSeparator());
        }
        resp.getWriter().println(result.toString());
        logger.info("Class StudentsReport method doGet finished");
    }
}