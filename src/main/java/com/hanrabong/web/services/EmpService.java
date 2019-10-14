package com.hanrabong.web.services;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.hanrabong.web.domains.DeptDTO;
import com.hanrabong.web.domains.EmpDTO;


@Component
public interface EmpService {
	
	public EmpDTO login(EmpDTO eb);
	public Boolean join(EmpDTO eb);

	public List<DeptDTO> findDept();	
	public List<EmpDTO> findEmps();	
	public EmpDTO findEmp(EmpDTO eb);	
	
}
