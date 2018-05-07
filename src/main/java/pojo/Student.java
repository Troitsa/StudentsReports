package pojo;

public class Student {
    private int id;
    private String name;
    private String surname;
    private int groups_id;
    private Group group;

    public Student(int id, String name, String surname, int groups_id) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.groups_id = groups_id;
    }

    public Student(int id, String name, String surname, int groups_id, Group group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.groups_id = groups_id;
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

    public int getGroups_id() {
        return groups_id;
    }

    public void setGroups_id(int groups_id) {
        this.groups_id = groups_id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
