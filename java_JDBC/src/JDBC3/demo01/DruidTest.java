package JDBC3.demo01;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

// 数据库连接池进行数据库的连接
public class DruidTest {
	@Test
	public void getConnection() throws Exception{
		Properties pros = new Properties();
		InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("druid.properties");
		pros.load(is);
		DataSource source = DruidDataSourceFactory.createDataSource(pros);
		Connection conn = source.getConnection();
		System.out.println(conn);
	}
}
