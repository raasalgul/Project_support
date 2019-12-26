package com.ce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Transactional
@Repository
public class DaoClass {
	@Autowired
	@Qualifier("jdbcTemplate2")
	JdbcTemplate jdbcTemplate;
	public List<BeanClass> getAllBeanClass(){
		String sql = "select csn.first_name,csn.last_name,csm.inception_date as effective_date,det.remit_due_dt,det.transaction_amt,det.transaction_date from QUA.casename csn,QUA.case_master csm,QUA.enote_detail det fetch first 20 rows only";
		List<BeanClass> rows = jdbcTemplate.query(sql,new BeanClassMapper());
		for(BeanClass row:rows){
			System.out.println(row.getFirst_name());
		}	
		return rows;
	}
}
