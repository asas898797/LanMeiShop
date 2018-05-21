package org.lanmei.commodity.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lanmei.commodity.dao.model.Commodity;
import org.springframework.stereotype.Repository;

@Repository
public interface CommodityMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer commodityId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity
	 * @mbg.generated
	 */
	int insert(Commodity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity
	 * @mbg.generated
	 */
	Commodity selectByPrimaryKey(Integer commodityId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity
	 * @mbg.generated
	 */
	List<Commodity> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Commodity record);

	Commodity selectByName(String name);
	
	List<Commodity> selectByCategoryId(@Param("categoryIdList") List<Integer> categoryIdList );
}