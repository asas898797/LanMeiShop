package org.lanmei.seckill.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lanmei.seckill.dao.model.SeckillSuccess;
import org.springframework.stereotype.Repository;

@Repository
public interface SeckillSuccessMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table seckill_success
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(@Param("seckillId") Integer seckillId, @Param("userId") Integer userId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table seckill_success
	 * @mbg.generated
	 */
	int insert(SeckillSuccess record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table seckill_success
	 * @mbg.generated
	 */
	SeckillSuccess selectByPrimaryKey(@Param("seckillId") Integer seckillId, @Param("userId") Integer userId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table seckill_success
	 * @mbg.generated
	 */
	List<SeckillSuccess> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table seckill_success
	 * @mbg.generated
	 */
	int updateByPrimaryKey(SeckillSuccess record);

	int insertRecord(SeckillSuccess record);

}