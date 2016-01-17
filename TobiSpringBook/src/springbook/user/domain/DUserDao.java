package springbook.user.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DUserDao extends UserDaoJdbc {

	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/springbook", "root", "han32683");
		
		return c;
	}
}
