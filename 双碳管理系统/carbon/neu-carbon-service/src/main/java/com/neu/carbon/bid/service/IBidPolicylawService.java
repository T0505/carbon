package com.neu.carbon.bid.service;

import java.util.List;
import com.neu.carbon.bid.domain.BidPolicylaw;

/**
 * 政策法规Service接口
 * 
 * @author neuedu
 * @date 2023-04-21
 */
public interface IBidPolicylawService 
{
    /**
     * 查询政策法规
     * 
     * @param id 政策法规ID
     * @return 政策法规
     */
    public BidPolicylaw selectBidPolicylawById(Long id);

    /**
     * 查询政策法规列表
     * 
     * @param bidPolicylaw 政策法规
     * @return 政策法规集合
     */
    public List<BidPolicylaw> selectBidPolicylawList(BidPolicylaw bidPolicylaw);

    /**
     * 新增政策法规
     * 
     * @param bidPolicylaw 政策法规
     * @return 结果
     */
    public int insertBidPolicylaw(BidPolicylaw bidPolicylaw);

    /**
     * 修改政策法规
     * 
     * @param bidPolicylaw 政策法规
     * @return 结果
     */
    public int updateBidPolicylaw(BidPolicylaw bidPolicylaw);

    /**
     * 批量删除政策法规
     * 
     * @param ids 需要删除的政策法规ID
     * @return 结果
     */
    public int deleteBidPolicylawByIds(Long[] ids);

    /**
     * 删除政策法规信息
     * 
     * @param id 政策法规ID
     * @return 结果
     */
    public int deleteBidPolicylawById(Long id);
}
