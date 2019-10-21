package com.hanrabong.web.mappers;

import com.hanrabong.web.domains.HCustDTO;

public interface HCustMapper {

	public HCustDTO selectCustById(HCustDTO param);
	public void insertUser(HCustDTO param);
	
	
}
