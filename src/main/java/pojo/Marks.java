package pojo;

public class Marks {
    private int id;
    private int student_id;
    private int lecture_id;
    private Student student;
    private Lecture lecture;
    private String date;
    private int mark;

    public Marks(int id, String date, int mark) {
        this.id = id;
        this.date = date;
        this.mark = mark;
    }

    public Marks(int id, int student_id, int lecture_id, int mark) {
        this.id = id;
        this.student_id = student_id;
        this.lecture_id = lecture_id;
        this.mark = mark;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Marks(int id, int student_id, int lecture_id, Student student, Lecture lecture, int mark) {
        this.id = id;
        this.student_id = student_id;
        this.lecture_id = lecture_id;
        this.student = student;
        this.lecture = lecture;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getLecture_id() {
        return lecture_id;
    }

    public void setLecture_id(int lecture_id) {
        this.lecture_id = lecture_id;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "date='" + date + '\'' +
                ", mark=" + mark +
                '}';
    }
}
