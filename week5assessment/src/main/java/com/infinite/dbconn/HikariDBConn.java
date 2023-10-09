//package com.infinite.dbconn;
//Hikari Db Connection class
//import javax.sql.DataSource;
//
//import org.springframework.context.annotation.Bean;
//
//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;
//
///**
// * @author narend
// *
// */
//public class HikariDBConn {
//
//	private static DataSource dataSource = null;
//	@Bean(destroyMethod="close")
//	public static DataSource getDataSource() {
//		if (dataSource == null) {
//			HikariConfig config = new HikariConfig();
//			config.setDriverClassName("com.mysql.cj.jdbc.Driver");
//			config.setJdbcUrl("jdbc:mysql://localhost:3306/week5test");
//			config.setUsername("root");
//			config.setPassword("narennaren");
//			config.setMaximumPoolSize(10);
//			config.setAutoCommit(true);
//			config.addDataSourceProperty("cachePrepStmts", "true");
//			config.addDataSourceProperty("prepStmtCacheSize", "250");
//			config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
//			dataSource = new HikariDataSource(config);
//		}
//		return dataSource;
//	}
//}
