package com.bootdo.system.service;

import com.bootdo.system.domain.CarDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-03-22 14:02:32
 */
public interface CarService {
	
	CarDO get(Long carId);
	
	List<CarDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CarDO car);
	
	int update(CarDO car);
	
	int remove(Long carId);
	
	int batchRemove(Long[] carIds);
}
