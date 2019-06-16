package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-03-22 14:02:32
 */
public class CarDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//ID
	private Long carId;
	//汽车品牌名
	private String carName;
	//汽车类型，1：轿车，2：suv，3：跑车
	private String carType;

	/**
	 * 设置：ID
	 */
	public void setCarId(Long carId) {
		this.carId = carId;
	}
	/**
	 * 获取：ID
	 */
	public Long getCarId() {
		return carId;
	}
	/**
	 * 设置：汽车品牌名
	 */
	public void setCarName(String carName) {
		this.carName = carName;
	}
	/**
	 * 获取：汽车品牌名
	 */
	public String getCarName() {
		return carName;
	}
	/**
	 * 设置：汽车类型，1：轿车，2：suv，3：跑车
	 */
	public void setCarType(String carType) {
		this.carType = carType;
	}
	/**
	 * 获取：汽车类型，1：轿车，2：suv，3：跑车
	 */
	public String getCarType() {
		return carType;
	}
}
