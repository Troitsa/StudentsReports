package db.connectionManager;

import org.apache.log4j.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManagerJDBCImpl implements ConnectionManager{
    private static ConnectionManager connectionManager;
    private static final Logger loggerError = Logger.getLogger(ConnectionManagerJDBCImpl.class);
    public static ConnectionManager getInstance(){
        if (connectionManager == null){
            connectionManager = new ConnectionManagerJDBCImpl();
        }
        return connectionManager;
    }

    private ConnectionManagerJDBCImpl(){

    }

    @Override
    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/TrainingCenter",
                    "postgres",
                    "rose03");
        } catch (ClassNotFoundException e) {
            loggerError.error("ClassNotFoundException at method getConnection", e);
        } catch (SQLException e) {
            loggerError.error("SQLException at method getConnection", e);
        }
        return connection;
    }
}