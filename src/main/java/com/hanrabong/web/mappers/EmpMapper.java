package com.hanrabong.web.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hanrabong.web.domains.DeptDTO;
import com.hanrabong.web.domains.EmpDTO;

@Repository
public interface EmpMapper {

	public EmpDTO login(EmpDTO eb);
	public Boolean insetEmp(EmpDTO eb);

	public List<DeptDTO> selectDept();	
	public List<EmpDTO> selectEmps();	
	public EmpDTO selectEmp(EmpDTO eb);	
	
	
	
}
