package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.CarDao;
import com.bootdo.system.domain.CarDO;
import com.bootdo.system.service.CarService;



@Service
public class CarServiceImpl implements CarService {
	@Autowired
	private CarDao carDao;
	
	@Override
	public CarDO get(Long carId){
		return carDao.get(carId);
	}
	
	@Override
	public List<CarDO> list(Map<String, Object> map){
		return carDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return carDao.count(map);
	}
	
	@Override
	public int save(CarDO car){
		return carDao.save(car);
	}
	
	@Override
	public int update(CarDO car){
		return carDao.update(car);
	}
	
	@Override
	public int remove(Long carId){
		return carDao.remove(carId);
	}
	
	@Override
	public int batchRemove(Long[] carIds){
		return carDao.batchRemove(carIds);
	}
	
}
