package dao;



import connectionManager.ConnectionManager;
import connectionManager.ConnectionManagerJDBCImpl;
import pojo.Group;

import java.sql.*;

public class GroupDAOImpl implements GroupDAO{
    private static ConnectionManager connectionManager = ConnectionManagerJDBCImpl.getInstance();
    @Override
    public void addGroup(Group group) throws SQLException {
        Connection connection = connectionManager.getConnection();
        String sql = "INSERT INTO groups (id,course_id) VALUES (?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, group.getId());
        statement.setInt(2, group.getCourse_id());
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
        statement.setInt(2, group.getCourse_id());
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
}
