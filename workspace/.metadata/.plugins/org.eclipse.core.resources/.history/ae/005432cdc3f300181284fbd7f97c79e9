package com.jp.hr.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;

/* The ClassNotException, SQLException must not come of DAO Class
 *	The database specific entities must not come out of the class(Like Exception and classes)
 *	Each and every resource (Connection, Statement , Resultset) must be closed properly
 *  Always prefer statement over PreparedStatement for non-interactive queries. [eg .select * from employees is the non -interactive query]
 *  Fetch the data page wise.
 *  Prefer mentioning column names instead of column position in getXXX() methods. note: position may change.
*/
public class DaoEmployeeImpl implements DaoEmployee {
	
	private Connection getConnection() 
			throws SQLException, ClassNotFoundException {
		String driverName = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/orcl";
		String userName = "hr";
		String password = "hr";
		
			Class.forName(driverName);		
			return DriverManager.getConnection(url,userName,password);
	}
	
	
	private void closeConnection(Connection connect) throws SQLException {
		connect.close();
	}

	@Override
	public ArrayList<Employee> getEmpList() throws HrException {
		
		ArrayList<Employee> empList = new ArrayList<>();
		Connection connect =null;
		Statement stmt=null;
		ResultSet rs =null;
		
		try {
			connect = getConnection();
			stmt = connect.createStatement();
			rs = stmt.executeQuery("SELECT * FROM EMP_DETAILS");
			
			while(rs.next()) {
				int empId = rs.getInt("employee_id");
				String  firstNm = rs.getString("first_name");
				String lastNm = rs.getString("last_name");
				empList.add(new Employee(empId,firstNm,lastNm));
				
			}
			
		} catch (ClassNotFoundException |SQLException e) {
			throw new HrException("Problem in Fetching.", e);
		}  finally {
			try {
				if (rs!=null) {
					rs.close();
				}				
				if (stmt!=null) {
					stmt.close();
				}
				closeConnection(connect);
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}
				
		return empList;
	}


	@Override
	public Employee getEmpDetails(int empId) throws HrException {
		Connection connect =null;
		PreparedStatement stmt=null;
		ResultSet rs =null;
		String qry = "Select employee_id,first_name,last_name FROM EMP_DETAILS where employee_id =?";
		
		try {
			connect = getConnection();
			stmt = connect.prepareStatement(qry);
			stmt.setInt(1, empId);
			
			rs = stmt.executeQuery();
						
			if(rs.next()) {				
				String  firstNm = rs.getString("first_name");
				String lastNm = rs.getString("last_name");				
				return new Employee(empId,firstNm,lastNm);
				
			} else {
				
				return null;
			}
			
		} catch (ClassNotFoundException |SQLException e) {
			throw new HrException("Problem in Fetching.", e);
		}  finally {
			try {
				if (rs!=null) {
					rs.close();
				}
				
				if (stmt!=null) {
					stmt.close();
				}			
				
				closeConnection(connect);
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}				
		
	}


	@Override
	public boolean insertNewRecord(Employee emp) throws HrException {
				
		String qry = "INSERT INTO EMP_DETAILS (employee_id,first_name,last_name) VALUES(?,?,?)";
		
		Connection connect =null;
		PreparedStatement stmt=null;
		
		try {
			connect = getConnection();
			stmt = connect.prepareStatement(qry);
			stmt.setInt(1, emp.getEmpId());
			stmt.setString(2, emp.getFirstName());
			stmt.setString(3, emp.getLastName());
			
			int recInserted = stmt.executeUpdate();
			return recInserted==1? true :false;			
			
		} catch (ClassNotFoundException |SQLException e) {
			throw new HrException("Problem in Fetching.", e);
		}  finally {
			try {
				
				if (stmt!=null) {
					stmt.close();
				}			
				
				closeConnection(connect);
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}	
		
	}

}
