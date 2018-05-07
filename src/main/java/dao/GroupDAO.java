package dao;

import pojo.Group;

import java.sql.SQLException;

public interface GroupDAO {
    public void addGroup(Group group) throws SQLException;
    public Group getGroupById(int id) throws SQLException;
    public void updateGroup(Group group) throws SQLException;
    public void deleteGroupById(int id) throws SQLException;
}
