package pojo;

public class Marks {
    private int id;
    private int studentId;
    private int lectureId;
    private Student student;
    private Lecture lecture;
    private String lectureTitle;
    private String date;
    private int mark;

    public Marks(int id, String date, String lectureTitle, int mark) {
        this.id = id;
        this.date = date;
        this.lectureTitle = lectureTitle;
        this.mark = mark;
    }

    public Marks(int id, int studentId, int lectureId, int mark) {
        this.id = id;
        this.studentId = studentId;
        this.lectureId = lectureId;
        this.mark = mark;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
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

    public String getLectureTitle() {
        return lectureTitle;
    }

    public void setLectureTitle(String lectureTitle) {
        this.lectureTitle = lectureTitle;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "date='" + date + '\'' +
                ", mark=" + mark +
                '}';
    }
}
