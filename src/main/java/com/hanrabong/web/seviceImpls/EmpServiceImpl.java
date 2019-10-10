package com.hanrabong.web.seviceImpls;

import java.util.List;

import com.hanrabong.web.daoImpls.EmpDaoImpl;
import com.hanrabong.web.domains.DeptBean;
import com.hanrabong.web.domains.EmpBean;
import com.hanrabong.web.services.EmpService;

public class EmpServiceImpl implements EmpService{

	private static EmpServiceImpl instance = new EmpServiceImpl();
	private EmpServiceImpl () {}
	public static EmpServiceImpl getInstance() {return instance;}
	
	
	@Override
	public EmpBean login(EmpBean eb) {
		
		return EmpDaoImpl.getInstance().login(eb);
	}

	@Override
	public Boolean join(EmpBean eb) {
		
		return EmpDaoImpl.getInstance().insetEmp(eb);
	}

	@Override
	public List<DeptBean> findDept() {
		return  EmpDaoImpl.getInstance().selectDept();
	}

	@Override
	public List<EmpBean> findEmps() {
		return EmpDaoImpl.getInstance().selectEmps();
	}

	@Override
	public EmpBean findEmp(EmpBean eb) {
		return EmpDaoImpl.getInstance().selectEmp(eb);
	}

}
