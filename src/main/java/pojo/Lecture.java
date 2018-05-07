package pojo;

import java.util.Date;

public class Lecture {
    private int id;
    private int lesson_id;
    private int groups_id;
    private Date date;
    private Date time;
    private Lesson lesson;
    private Group groups;

    public Lecture(int id, int lesson_id, int groups_id) {
        this.id = id;
        this.lesson_id = lesson_id;
        this.groups_id = groups_id;
    }

    public Lecture(int id, int lesson_id, int groups_id, Lesson lesson, Group groups) {
        this.id = id;
        this.lesson_id = lesson_id;
        this.groups_id = groups_id;
        this.lesson = lesson;
        this.groups = groups;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLesson_id() {
        return lesson_id;
    }

    public void setLesson_id(int lesson_id) {
        this.lesson_id = lesson_id;
    }

    public int getGroups_id() {
        return groups_id;
    }

    public void setGroups_id(int groups_id) {
        this.groups_id = groups_id;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public Group getGroups() {
        return groups;
    }

    public void setGroups(Group groups) {
        this.groups = groups;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = new java.sql.Date(date.getTime());;
    }

    public Date getDate() {
        return date;
    }
}
