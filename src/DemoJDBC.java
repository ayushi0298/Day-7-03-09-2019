import java.sql.DriverManager;
import java.sql.*;

public class DemoJDBC {
	public static void create(Connection conn) throws Exception {
		Statement st= conn.createStatement();
		String s="create table Employee ( eno int(20) primary key, ename  varchar(50),basicSalary varchar(10))";
		st.executeUpdate(s);
		System.out.println("TABLE CREATION COMPLETED");
		
	}
	public static void insert(Connection conn) throws Exception {
		Statement st= conn.createStatement();
		String s="insert into  Employee values (10,'Ayushi',3000)";
		st.executeUpdate(s);
		System.out.println("INSERTION COMPLETED");
		
	}
	public static void update(Connection conn) throws Exception {
		Statement st= conn.createStatement();
		String s="update Employee set ename='Prakhar' where eno=10";
		st.executeUpdate(s);
		System.out.println("UPDATION COMPLETED");
		
	}
	public static void delete(Connection conn) throws Exception {
		Statement st= conn.createStatement();
		String s="delete from Employee where ename='Prakhar'";
		st.executeUpdate(s);
		System.out.println("DELETION COMPLETED");
	}
	public static void alter(Connection conn) throws Exception {
		Statement st= conn.createStatement();
		String s="alter table Employee add Address varchar(50) ";
		st.executeUpdate(s);
		System.out.println("OPERATION COMPLETED");
	}
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");//Driver
		String url="jdbc:mysql://localhost:3306/test";
		Connection conn= DriverManager.getConnection(url,"root", "root");//Establish connection
        
		create(conn);
		insert(conn);
		update(conn);
		delete(conn);
		alter(conn);
		
	
		
		
		
		
		
		
		

	}

}
