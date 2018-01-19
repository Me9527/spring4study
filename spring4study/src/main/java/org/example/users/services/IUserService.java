package org.example.users.services;

import java.util.List;
import java.util.Map;

public interface IUserService {
	public String funcOne(String param);
	public void funcTwo(String param);
	
	public List<Map<String, Object>> getBiz01(String param);
	public void addBiz01(String param);
	
}
