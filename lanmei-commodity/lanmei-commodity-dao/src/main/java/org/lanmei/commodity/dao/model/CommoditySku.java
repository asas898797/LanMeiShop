package org.lanmei.commodity.dao.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table commodity_sku
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class CommoditySku {

	/**
	 * Database Column Remarks: sku ID This field was generated by MyBatis Generator. This field corresponds to the database column commodity_sku.sku_id
	 * @mbg.generated
	 */
	private Integer skuId;
	/**
	 * Database Column Remarks: 商品ID This field was generated by MyBatis Generator. This field corresponds to the database column commodity_sku.sku_collect_id
	 * @mbg.generated
	 */
	private Integer skuCollectId;
	/**
	 * Database Column Remarks: 名称:颜色/样式／款式/尺寸等 This field was generated by MyBatis Generator. This field corresponds to the database column commodity_sku.name
	 * @mbg.generated
	 */
	private String name;
	/**
	 * Database Column Remarks: 属性值 This field was generated by MyBatis Generator. This field corresponds to the database column commodity_sku.attr
	 * @mbg.generated
	 */
	private String attr;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column commodity_sku.sku_id
	 * @return  the value of commodity_sku.sku_id
	 * @mbg.generated
	 */
	public Integer getSkuId() {
		return skuId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column commodity_sku.sku_id
	 * @param skuId  the value for commodity_sku.sku_id
	 * @mbg.generated
	 */
	public void setSkuId(Integer skuId) {
		this.skuId = skuId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column commodity_sku.sku_collect_id
	 * @return  the value of commodity_sku.sku_collect_id
	 * @mbg.generated
	 */
	public Integer getSkuCollectId() {
		return skuCollectId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column commodity_sku.sku_collect_id
	 * @param skuCollectId  the value for commodity_sku.sku_collect_id
	 * @mbg.generated
	 */
	public void setSkuCollectId(Integer skuCollectId) {
		this.skuCollectId = skuCollectId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column commodity_sku.name
	 * @return  the value of commodity_sku.name
	 * @mbg.generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column commodity_sku.name
	 * @param name  the value for commodity_sku.name
	 * @mbg.generated
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column commodity_sku.attr
	 * @return  the value of commodity_sku.attr
	 * @mbg.generated
	 */
	public String getAttr() {
		return attr;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column commodity_sku.attr
	 * @param attr  the value for commodity_sku.attr
	 * @mbg.generated
	 */
	public void setAttr(String attr) {
		this.attr = attr;
	}
}