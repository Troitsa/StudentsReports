package pojo;

public class Student {
    private int id;
    private String name;
    private String surname;
    private int groupsId;
    private Group group;

    public Student(int id, String name, String surname, int groupsId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.groupsId = groupsId;
    }

    public Student(int id, String name, String surname, int groupsId, Group group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.groupsId = groupsId;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGroupsId() {
        return groupsId;
    }

    public void setGroupsId(int groupsId) {
        this.groupsId = groupsId;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}