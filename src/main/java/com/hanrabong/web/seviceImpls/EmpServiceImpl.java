package com.hanrabong.web.seviceImpls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanrabong.web.domains.DeptDTO;
import com.hanrabong.web.domains.EmpDTO;
import com.hanrabong.web.mappers.EmpMapper;
import com.hanrabong.web.services.EmpService;
@Service
public class EmpServiceImpl implements EmpService{

	@Autowired EmpMapper mapper;
	
	
	@Override
	public EmpDTO login(EmpDTO eb) {
		        
		return null;
	}

	@Override
	public Boolean join(EmpDTO eb) {
		
		return null;      
	}

	@Override
	public List<DeptDTO> findDept() {
		return  null;
	}

	@Override
	public List<EmpDTO> findEmps() {
		return null;
	}

	@Override
	public EmpDTO findEmp(EmpDTO eb) {
		return null;
	}

}
