package com.directional.base.mapper;

import com.directional.base.entity.OrderWechatLog;
import com.directional.base.entity.OrderWechatLogWithBLOBs;

public interface OrderWechatLogMapper {
    /**
     * 根据主键删除
     * 参数:主键
     * 返回:删除个数
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    int deleteByPrimaryKey(String orderInfoId);

    /**
     * 插入，空属性也会插入
     * 参数:pojo对象
     * 返回:删除个数
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    int insert(OrderWechatLogWithBLOBs record);

    /**
     * 插入，空属性不会插入
     * 参数:pojo对象
     * 返回:删除个数
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    int insertSelective(OrderWechatLogWithBLOBs record);

    /**
     * 根据主键查询
     * 参数:查询条件,主键值
     * 返回:对象
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    OrderWechatLogWithBLOBs selectByPrimaryKey(String orderInfoId);

    /**
     * 根据主键修改，空值条件不会修改成null
     * 参数:1.要修改成的值
     * 返回:成功修改个数
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    int updateByPrimaryKeySelective(OrderWechatLogWithBLOBs record);

    /**
     * 根据主键修改，空值条件会修改成null,支持大字段类型
     * 参数:1.要修改成的值
     * 返回:成功修改个数
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    int updateByPrimaryKeyWithBLOBs(OrderWechatLogWithBLOBs record);

    /**
     * 根据主键修改，空值条件会修改成null
     * 参数:1.要修改成的值
     * 返回:成功修改个数
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    int updateByPrimaryKey(OrderWechatLog record);
}