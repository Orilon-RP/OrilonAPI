package fr.orilon.api.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.function.Consumer;

public interface DatabaseManager {
    void connect();

    void disconnect();

    void createTables();

    void update(String query);

    void query(String query, Consumer<ResultSet> consumer);

    Connection getConnection();
}
