package ExerciciosJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import java.text.SimpleDateFormat;

import db.DB;

public class Exercicio03 {

	public static void main(String[] args) {
		
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Connection conn = null;
		
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			/*
			st = conn.prepareStatement(
					"INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+ "VALUES "
					+ "(?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);
			
			st.setString(1, "Kaua Almeida");
			st.setString(2, "kaua@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("20/11/2004").getTime()));
			st.setDouble(4, 4000.00);
			st.setInt(5, 1);
			*/
			
			st = conn.prepareStatement("insert into department(Name) values ('d1'), ('d2')",
					Statement.RETURN_GENERATED_KEYS);
			
			
			int rowsAffected = st.executeUpdate();
			
			if(rowsAffected > 0) {
					ResultSet rs = st.getGeneratedKeys();
					
					while(rs.next()) {
						int id = rs.getInt(1);
						System.out.println("Done! Id = " + id);
						
					}
			}else {
				System.out.println("NO ROWN AFFECTED!");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
	}
	

}