package com.directional.base.mapper;

import com.directional.base.entity.OrderAlipayLog;
import com.directional.base.entity.OrderAlipayLogWithBLOBs;

public interface OrderAlipayLogMapper {
    /**
     * 根据主键删除
     * 参数:主键
     * 返回:删除个数
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    int deleteByPrimaryKey(String orderInfoId);

    /**
     * 插入，空属性也会插入
     * 参数:pojo对象
     * 返回:删除个数
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    int insert(OrderAlipayLogWithBLOBs record);

    /**
     * 插入，空属性不会插入
     * 参数:pojo对象
     * 返回:删除个数
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    int insertSelective(OrderAlipayLogWithBLOBs record);

    /**
     * 根据主键查询
     * 参数:查询条件,主键值
     * 返回:对象
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    OrderAlipayLogWithBLOBs selectByPrimaryKey(String orderInfoId);

    /**
     * 根据主键修改，空值条件不会修改成null
     * 参数:1.要修改成的值
     * 返回:成功修改个数
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    int updateByPrimaryKeySelective(OrderAlipayLogWithBLOBs record);

    /**
     * 根据主键修改，空值条件会修改成null,支持大字段类型
     * 参数:1.要修改成的值
     * 返回:成功修改个数
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    int updateByPrimaryKeyWithBLOBs(OrderAlipayLogWithBLOBs record);

    /**
     * 根据主键修改，空值条件会修改成null
     * 参数:1.要修改成的值
     * 返回:成功修改个数
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    int updateByPrimaryKey(OrderAlipayLog record);
}