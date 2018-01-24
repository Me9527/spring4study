package org.example.users.services.impl;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.example.users.services.IUserService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

// @Component、@Repository、@Service
@Service("userService")
public class UserServiceImpl implements IUserService {

	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	private Logger logger = Logger.getLogger(this.getClass());

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}

	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	@Override
	public String funcOne(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void funcTwo(String param) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Map<String, Object>> getBiz01(String param) {
		String query = "select id, name from test_user";
		List<Map<String, Object>> rs = jdbcTemplate.queryForList(query);
		// System.out.println(rs);
		return rs;
	}

	@Override
	public void addBiz01(String param) {
		String insert = "insert into test_user (name) values (?)";
		logger.info(param);
		jdbcTemplate.update(insert, param);
	}
}
