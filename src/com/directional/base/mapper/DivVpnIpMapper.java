package com.directional.base.mapper;

import com.directional.base.entity.DivVpnIp;

public interface DivVpnIpMapper {
    /**
     * 根据主键删除
     * 参数:主键
     * 返回:删除个数
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    int deleteByPrimaryKey(String vpnIp);

    /**
     * 插入，空属性也会插入
     * 参数:pojo对象
     * 返回:删除个数
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    int insert(DivVpnIp record);

    /**
     * 插入，空属性不会插入
     * 参数:pojo对象
     * 返回:删除个数
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    int insertSelective(DivVpnIp record);

    /**
     * 根据主键查询
     * 参数:查询条件,主键值
     * 返回:对象
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    DivVpnIp selectByPrimaryKey(String vpnIp);

    /**
     * 根据主键修改，空值条件不会修改成null
     * 参数:1.要修改成的值
     * 返回:成功修改个数
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    int updateByPrimaryKeySelective(DivVpnIp record);

    /**
     * 根据主键修改，空值条件会修改成null
     * 参数:1.要修改成的值
     * 返回:成功修改个数
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    int updateByPrimaryKey(DivVpnIp record);
}