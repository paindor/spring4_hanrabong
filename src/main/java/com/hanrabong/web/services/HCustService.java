package com.hanrabong.web.services;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.hanrabong.web.domains.HAdminDTO;
import com.hanrabong.web.domains.HCustDTO;


@Component
public interface HCustService {
	
	public HCustDTO login(HCustDTO eb);
	public void join(HCustDTO eb);

	public List<HAdminDTO> findDept();	
	public List<HCustDTO> findEmps();	
	public HCustDTO findEmp(HCustDTO eb);	
	
	public int countHCusts();
	
}
