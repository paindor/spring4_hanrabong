package com.hanrabong.web.seviceImpls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanrabong.web.domains.HAdminDTO;
import com.hanrabong.web.domains.HCustDTO;
import com.hanrabong.web.mappers.EmpMapper;
import com.hanrabong.web.mappers.HCustMapper;
import com.hanrabong.web.services.HCustService;
@Service
public class HCustServiceImpl implements HCustService{

	@Autowired HCustMapper custMapper;
	
	
	@Override
	public HCustDTO login(HCustDTO param) {
		        
		return custMapper.selectCustById(param) ;
	}

	@Override
	public void join(HCustDTO param) {
		
		custMapper.insertUser(param);    
	}

	@Override
	public List<HAdminDTO> findDept() {
		return  null;
	}

	@Override
	public List<HCustDTO> findEmps() {
		return null;
	}

	@Override
	public HCustDTO findEmp(HCustDTO eb) {
		return null;
	}

	@Override
	public int countHCusts() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
