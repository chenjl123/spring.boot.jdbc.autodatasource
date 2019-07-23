package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.datasource.DynamicDataSourceContextHolder;

@Service
public class TestService {
	
	@Autowired
	private JdbcTemplate temp;
	
	public void query(String sid){
		this.setDs(sid);
		
    	List<Map<String, Object>> list = temp.queryForList("select * from log_emperorinstance_end");
    	for(Map<String, Object> map : list){
    		for(Map.Entry<String, Object> entry : map.entrySet()){
    			System.out.println(entry.getValue());
    		}
    	}
    	System.out.println("#####################################");
	}
	
	private void setDs(String sid){
	   sid = "ds"+sid;
	   if (!DynamicDataSourceContextHolder.containsDataSource(sid)) {
           System.out.println("数据源不存在，使用默认数据源 ");
       }
       else {
           DynamicDataSourceContextHolder.setDataSourceType(sid);
       }
	}
}
