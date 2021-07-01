package secrects;

public class Secretes {
	final protected static String username = "";
	final protected static String password = "";
	final protected static String database = "student";
	final protected static String url = "jdbc:mysql://127.0.0.1:3306/";
	public static String getUsername() {
		return username;
	}
	public static String getPassword() {
		return password;
	}
	public static String getDatabase() {
		return database;
	}
	public static String getUrl() {
		return url;
	}
}
