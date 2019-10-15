package com.hanrabong.web.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hanrabong.web.domains.HAdminDTO;
import com.hanrabong.web.domains.HCustDTO;

@Repository
public interface EmpMapper {

	public HCustDTO login(HCustDTO eb);
	public Boolean insetEmp(HCustDTO eb);

	public List<HAdminDTO> selectDept();	
	public List<HCustDTO> selectEmps();	
	public HCustDTO selectEmp(HCustDTO eb);	
	
	public int countEmp();
	
	
}
