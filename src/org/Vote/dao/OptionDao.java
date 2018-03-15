package org.Vote.dao;

import java.util.List;

import org.Vote.pojo.Option;
import org.apache.ibatis.annotations.Param;

public interface OptionDao extends CommonDao<Option, Integer>{
	
	public void batchAdd(@Param("list") List<Option> options);
}
