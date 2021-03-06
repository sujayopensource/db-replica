package com.atlassian.db.replica.api.mocks;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class NoOpConnection implements Connection {
    @Override
    public Statement createStatement() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public PreparedStatement prepareStatement(String sql) {
        return new NoOpPreparedStatement();
    }

    @Override
    public CallableStatement prepareCall(String sql) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public String nativeSQL(String sql) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void setAutoCommit(boolean autoCommit) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public boolean getAutoCommit() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void commit() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void rollback() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void close() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public boolean isClosed() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public DatabaseMetaData getMetaData() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void setReadOnly(boolean readOnly) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public boolean isReadOnly() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void setCatalog(String catalog) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public String getCatalog() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void setTransactionIsolation(int level) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public int getTransactionIsolation() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public SQLWarning getWarnings() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void clearWarnings() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public Statement createStatement(int resultSetType, int resultSetConcurrency) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public Map<String, Class<?>> getTypeMap() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void setTypeMap(Map<String, Class<?>> map) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void setHoldability(int holdability) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public int getHoldability() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public Savepoint setSavepoint() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public Savepoint setSavepoint(String name) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void rollback(Savepoint savepoint) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void releaseSavepoint(Savepoint savepoint) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public PreparedStatement prepareStatement(
        String sql,
        int resultSetType,
        int resultSetConcurrency,
        int resultSetHoldability
    ) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public CallableStatement prepareCall(
        String sql,
        int resultSetType,
        int resultSetConcurrency,
        int resultSetHoldability
    ) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int[] columnIndexes) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public PreparedStatement prepareStatement(String sql, String[] columnNames) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public Clob createClob() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public Blob createBlob() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public NClob createNClob() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public SQLXML createSQLXML() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public boolean isValid(int timeout) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void setClientInfo(String name, String value) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void setClientInfo(Properties properties) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public String getClientInfo(String name) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public Properties getClientInfo() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public Array createArrayOf(String typeName, Object[] elements) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public Struct createStruct(String typeName, Object[] attributes) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void setSchema(String schema) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public String getSchema() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void abort(Executor executor) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void setNetworkTimeout(Executor executor, int milliseconds) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public int getNetworkTimeout() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        throw new SQLException("Not implemented");
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) {
        throw new RuntimeException("Not implemented");
    }
}
