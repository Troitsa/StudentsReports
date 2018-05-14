package pojo;

public class Lesson {
    private int id;
    private String title;
    private int courseId;
    private int teacherId;
    private int hours;
    private Course course;
    private Teacher teacher;

    public Lesson(int id, String title, int courseId, int teacherId, int hours) {
        this.id = id;
        this.title = title;
        this.courseId = courseId;
        this.teacherId = teacherId;
        this.hours = hours;
    }

    public Lesson(int id, String title, int courseId, int teacherId, int hours, Course course, Teacher teacher) {
        this.id = id;
        this.title = title;
        this.courseId = courseId;
        this.teacherId = teacherId;
        this.hours = hours;
        this.course = course;
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
