package config;

public class DaoConfig {
	
	public static String DATABASE_NAME = "lifeX";
	public static String URL = "jdbc:mysql://localhost/" + DATABASE_NAME + "?serverTimezone=GMT";
	public static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static String USERNAME = "root";
	public static String PASSWORD = "password";
	public static String TABLE_NAME = "lifex_users";
}
