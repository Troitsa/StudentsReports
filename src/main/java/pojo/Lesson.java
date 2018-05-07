package pojo;

public class Lesson {
    private int id;
    private int course_id;
    private int teacher_id;
    private int hours;
    private Course course;
    private Teacher teacher;

    public Lesson(int id, int course_id, int teacher_id, int hours) {
        this.id = id;
        this.course_id = course_id;
        this.teacher_id = teacher_id;
        this.hours = hours;
    }

    public Lesson(int id, int course_id, int teacher_id, int hours, Course course, Teacher teacher) {
        this.id = id;
        this.course_id = course_id;
        this.teacher_id = teacher_id;
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

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
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
}
