package com.zhongda.quote.dao;

import java.util.List;

import com.zhongda.quote.model.Address;

public interface AddressMapper {

    Address selectByPrimaryKey(Integer id);

    /**
	 * 查询所有的省
	 * @return
	 */
	List<Address> selectAllProvince();

	/**
	 * 通过省的id查询出在该省下面所有的市
	 * @param id 省份的id
	 * @return
	 */
	List<Address> selectAllCityByProvince(Integer id);

	/**
	 * 通过市的id查询出在该市下面所有的县(区)
	 * @param id 市的id
	 * @return
	 */
	List<Address> selectAllCountyByCity(Integer id);
}