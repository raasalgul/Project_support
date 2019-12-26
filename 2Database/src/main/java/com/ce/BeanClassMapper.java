package com.ce;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BeanClassMapper implements RowMapper<BeanClass>{

	@Override
	public BeanClass mapRow(ResultSet rs, int rowNum) throws SQLException {
		BeanClass bc=new BeanClass();
		bc.setFirst_name(rs.getString("First_name"));
		bc.setLast_name(rs.getString("Last_name"));
		bc.setRemit_due_dt(rs.getString("remit_due_dt"));
		bc.setEffective_date(rs.getString("effective_date"));
		bc.setTransaction_date(rs.getString("transaction_date"));
		bc.setTransaction_amt(rs.getString("transaction_amt"));
		return bc;
	}

}
