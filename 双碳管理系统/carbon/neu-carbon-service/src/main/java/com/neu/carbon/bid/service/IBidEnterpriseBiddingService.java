package com.neu.carbon.bid.service;

import java.util.List;
import com.neu.carbon.bid.domain.BidEnterpriseBidding;

/**
 * 企业投标Service接口
 * 
 * @author neuedu
 * @date 2023-04-21
 */
public interface IBidEnterpriseBiddingService 
{
    /**
     * 查询企业投标
     * 
     * @param id 企业投标ID
     * @return 企业投标
     */
    public BidEnterpriseBidding selectBidEnterpriseBiddingById(Long id);

    /**
     * 查询企业投标列表
     * 
     * @param bidEnterpriseBidding 企业投标
     * @return 企业投标集合
     */
    public List<BidEnterpriseBidding> selectBidEnterpriseBiddingList(BidEnterpriseBidding bidEnterpriseBidding);

    /**
     * 新增企业投标
     * 
     * @param bidEnterpriseBidding 企业投标
     * @return 结果
     */
    public int insertBidEnterpriseBidding(BidEnterpriseBidding bidEnterpriseBidding);

    /**
     * 修改企业投标
     * 
     * @param bidEnterpriseBidding 企业投标
     * @return 结果
     */
    public int updateBidEnterpriseBidding(BidEnterpriseBidding bidEnterpriseBidding);

    /**
     * 批量删除企业投标
     * 
     * @param ids 需要删除的企业投标ID
     * @return 结果
     */
    public int deleteBidEnterpriseBiddingByIds(Long[] ids);

    /**
     * 删除企业投标信息
     * 
     * @param id 企业投标ID
     * @return 结果
     */
    public int deleteBidEnterpriseBiddingById(Long id);
}
