package com.neu.carbon.mes.service;

import java.util.List;
import com.neu.carbon.mes.domain.MesFactoryModelDetail;

/**
 * 工厂建模明细Service接口
 * 
 * @author neuedu
 * @date 2022-07-07
 */
public interface IMesFactoryModelDetailService 
{
    /**
     * 查询工厂建模明细
     * 
     * @param id 工厂建模明细ID
     * @return 工厂建模明细
     */
    public MesFactoryModelDetail selectMesFactoryModelDetailById(Long id);

    /**
     * 查询工厂建模明细列表
     * 
     * @param mesFactoryModelDetail 工厂建模明细
     * @return 工厂建模明细集合
     */
    public List<MesFactoryModelDetail> selectMesFactoryModelDetailList(MesFactoryModelDetail mesFactoryModelDetail);

    /**
     * 新增工厂建模明细
     * 
     * @param mesFactoryModelDetail 工厂建模明细
     * @return 结果
     */
    public int insertMesFactoryModelDetail(MesFactoryModelDetail mesFactoryModelDetail);

    /**
     * 修改工厂建模明细
     * 
     * @param mesFactoryModelDetail 工厂建模明细
     * @return 结果
     */
    public int updateMesFactoryModelDetail(MesFactoryModelDetail mesFactoryModelDetail);

    /**
     * 批量删除工厂建模明细
     * 
     * @param ids 需要删除的工厂建模明细ID
     * @return 结果
     */
    public int deleteMesFactoryModelDetailByIds(Long[] ids);

    /**
     * 删除工厂建模明细信息
     * 
     * @param id 工厂建模明细ID
     * @return 结果
     */
    public int deleteMesFactoryModelDetailById(Long id);
}
