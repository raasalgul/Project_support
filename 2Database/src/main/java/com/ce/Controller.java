package com.ce;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Transactional
@Repository
public class Controller {
	@Autowired
	@Qualifier("jdbcTemplate1")
	JdbcTemplate jdbcTemplate;
	@GetMapping(path="/all")
	public String getAllUsers() {
		List<Map<String, Object>> ce= jdbcTemplate.queryForList("select * from ce_database.xb");
		System.out.println(ce.get(0).toString());
		return "MYSQL";
}
}