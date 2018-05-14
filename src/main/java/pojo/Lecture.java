package pojo;

import java.util.Date;

public class Lecture {
    private int id;
    private String title;
    private int lessonId;
    private int groupsId;
    private Date date;
    private Date time;
    private Lesson lesson;
    private Group groups;

    public Lecture(int id, int lessonId, int groupsId) {
        this.id = id;
        this.lessonId = lessonId;
        this.groupsId = groupsId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public int getGroupsId() {
        return groupsId;
    }

    public void setGroupsId(int groupsId) {
        this.groupsId = groupsId;
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

    public Date getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
