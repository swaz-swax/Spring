package com.cg.emp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cg.emp.dto.Employee;
import com.cg.emp.exception.EmployeeException;
import com.cg.emp.util.DBUtil;

public class EmployeeDAOImpl implements IEmployeeDAO {

	@Override
	public List<Employee> getEmployees() throws EmployeeException {
		Connection con=DBUtil.getConnection();
		List<Employee> employeesList=new ArrayList<Employee>();
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM empl");
			while (rs.next()) 
			{
				Employee employee=new Employee();
				employee.setId(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setGender(rs.getString(3));
				employee.setAge(rs.getInt(4));
				employee.setSalary(rs.getDouble(5));
				employeesList.add(employee);
				//return employeesList;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employeesList;
	}

}
