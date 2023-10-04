package com.infinite.datasource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikariCPTest {

	private static DataSource datasource = null;

	public static DataSource getDataSource() {
		if (datasource == null) {
			HikariConfig config = new HikariConfig();
			config.setJdbcUrl("jdbc:mysql://localhost:3306/training");
			config.setUsername("root");
			config.setPassword("narennaren");
			config.setMaximumPoolSize(10);
			config.setAutoCommit(false);
			config.addDataSourceProperty("cachePrepStmts", "true");
			config.addDataSourceProperty("prepStmtCacheSize", "250");
			;
			config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
			datasource = new HikariDataSource(config);
		}
		return datasource;
	}

	public static void main(String[] arg) {
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet resultset = null;
		try {
			DataSource datasource = HikariCPTest.getDataSource();
			connection = datasource.getConnection();
			pstmt = connection.prepareStatement("select * from login");
			System.out.println("the connection" + connection.getClass());
			resultset = pstmt.executeQuery();
			while (resultset.next()) {
				System.out.println(resultset.getString(1) + "," + resultset.getString(2));
			}
		} catch (Exception e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
}