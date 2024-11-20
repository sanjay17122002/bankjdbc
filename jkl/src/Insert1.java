import java.sql.*;
public class Insert1 {
public static void insert() throws Exception{
	String url = "jdbc:mysql://127.0.0.1:3306/csv";
	String username = "root";
	String password = "San11jay@11";
	String query = "insert into gym values(?,?,?)";
	Connection son = DriverManager.getConnection(url, username, password);
	PreparedStatement ast = son.prepareStatement(query);
	ast.setInt(1, 101);
	ast.setString(2, "sanjay");
	ast.setInt(3, 24);
	ast.executeUpdate();
	son.close();
	System.out.println("data inserted");
	
}

public static void main(String[] args) throws Exception {
	Insert1 obj = new Insert1();
	obj.insert();
	
}
}
