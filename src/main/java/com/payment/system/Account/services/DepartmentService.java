package com.payment.system.Account.services;

import java.util.List;

import com.payment.system.Account.dto.DepartmentsDTO;

public interface DepartmentService {
	
	
	public void addDept(DepartmentsDTO dto);
	public List<DepartmentsDTO> getDepartments(String dept_code);
	
	public void updateDept(DepartmentsDTO dto);
	
	public void deleteDept(DepartmentsDTO dto);

}
