package com.syntellect.sql;
import java.sql.*;
public class Sqldb {
public void db() {
	Connection connection=null;
	try {
		Class.forName("org.postgresql.Driver");
		connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/students","postgres","root");
	} catch (Exception e) {
		e.printStackTrace();
	}
	String query="insert into students(first_name,last_name,student_id) values('Nikhil','Gujar','101')";
	String show="select * from students";
	Statement st=null;
	try {
		st=connection.createStatement();
	} catch (Exception e) {
		e.printStackTrace();	
		}
	try {
		int rs= st.executeUpdate(query);
		} catch (Exception e) {
		e.printStackTrace();
		}
	try {
		ResultSet r=st.executeQuery(show);
		while (r.next()) {
			String name=r.getString("first_name");
			String lastname=r.getString("last_name");
			int id=r.getInt("student_id");
			System.out.println("name :"+ name + " last name : "+ lastname + " id :"+ id);
		}
	} catch (Exception e) {
		e.printStackTrace();
		}
	
}
}
