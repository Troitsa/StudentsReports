package pojo;

public class Group {
    private int id;
    private int course_id;
    private Course course;

    public Group(int id, int course_id) {
        this.id = id;
        this.course_id = course_id;
    }

    public Group(int id, int course_id, Course course) {
        this.id = id;
        this.course_id = course_id;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

}
