package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBC {
	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/Entreprise";
		String uname="root";
		String password="mypassword1234@";
		String query="select * from Employees";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection con=DriverManager.getConnection(url,uname,password);
			Statement statement=con.createStatement();
			ResultSet result=statement.executeQuery(query);
			while(result.next()) {
				String EmployeeData="";
				for(int i=1;i<=4;++i){
					EmployeeData+=result.getString(i)+ ":";
				}
				System.out.println(EmployeeData);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	

}
