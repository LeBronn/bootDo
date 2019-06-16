package com.bootdo.system.dao;

import com.bootdo.system.domain.CarDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-03-22 14:02:32
 */
@Mapper
public interface CarDao {

	CarDO get(Long carId);
	
	List<CarDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CarDO car);
	
	int update(CarDO car);
	
	int remove(Long car_id);
	
	int batchRemove(Long[] carIds);
}
