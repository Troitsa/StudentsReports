package db.dao;

import pojo.Group;
import java.sql.SQLException;
import java.util.List;

public interface GroupDAO {
    void addGroup(Group group) throws SQLException;
    Group getGroupById(int id) throws SQLException;
    void updateGroup(Group group) throws SQLException;
    void deleteGroupById(int id) throws SQLException;
    List<Group> getAllGroups() throws SQLException;
}
