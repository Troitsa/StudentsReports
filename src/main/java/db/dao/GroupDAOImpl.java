package db.dao;

import db.connectionManager.ConnectionManager;
import db.connectionManager.ConnectionManagerJDBCImpl;
import org.apache.log4j.Logger;
import pojo.Group;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GroupDAOImpl implements GroupDAO{
    private static final Logger logger = Logger.getLogger(GroupDAOImpl.class);
    private static ConnectionManager connectionManager = ConnectionManagerJDBCImpl.getInstance();
    @Override
    public void addGroup(Group group) throws SQLException {
        Connection connection = connectionManager.getConnection();
        String sql = "INSERT INTO groups (id,course_id) VALUES (?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, group.getId());
        statement.setInt(2, group.getCourseId());
        statement.executeUpdate();
    }

    @Override
    public Group getGroupById(int id) throws SQLException {
        Connection connection = connectionManager.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT * " +
                "FROM groups WHERE id = ?");
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        Group group = null;
        if (resultSet.next()){
            group = new Group(
                    resultSet.getInt("id"),
                    resultSet.getInt("course_id"));
        }
        connection.close();
        return group;
    }

    @Override
    public void updateGroup(Group group) throws SQLException {
        Connection connection = connectionManager.getConnection();
        String sql = "UPDATE group SET id = ?, course_id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, group.getId());
        statement.setInt(2, group.getCourseId());
        statement.executeUpdate();
        connection.close();
    }

    @Override
    public void deleteGroupById(int id) throws SQLException {
        Connection connection = connectionManager.getConnection();
        String sql = "DELETE FROM groups WHERE id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.executeUpdate();
        connection.close();
    }

    @Override
    public List<Group> getAllGroups() throws SQLException {
        logger.info("Class GroupDAOImpl method getAllGroup started");
        Connection connection = connectionManager.getConnection();
        PreparedStatement statement = null;
        statement = connection.prepareStatement("SELECT * FROM groups");
        ResultSet resultSet = statement.executeQuery();
        ArrayList<Group> groups = new ArrayList<>();
        while (resultSet.next()) {
            groups.add(new Group(
                    resultSet.getInt("id"),
                    resultSet.getInt("course_id")));
        }
        connection.close();
        logger.info("Class GroupDAOImpl method getAllGroup finished");
        return groups;
    }
}
