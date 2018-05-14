package pojo;

public class Group {
    private int id;
    private int courseId;
    private Course course;

    public Group(int id, int courseId) {
        this.id = id;
        this.courseId = courseId;
    }

    public Group(int id, int courseId, Course course) {
        this.id = id;
        this.courseId = courseId;
        this.course = course;
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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

}
