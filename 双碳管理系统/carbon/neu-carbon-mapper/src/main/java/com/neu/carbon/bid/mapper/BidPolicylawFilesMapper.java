package com.neu.carbon.bid.mapper;

import java.util.List;

import com.neu.carbon.bid.domain.BidPolicylawFiles;

/**
 * 政策法规附件Mapper接口
 *
 * @author neuedu
 * @date 2023-04-21
 */
public interface BidPolicylawFilesMapper {
    /**
     * 查询政策法规附件
     *
     * @param id 政策法规附件ID
     * @return 政策法规附件
     */
    public BidPolicylawFiles selectBidPolicylawFilesById(Long id);

    /**
     * 按政策法规Id查询
     *
     * @param id
     * @return
     */
    List<BidPolicylawFiles> selectBidPolicylawFilesByPId(Long id);

    /**
     * 查询政策法规附件列表
     *
     * @param bidPolicylawFiles 政策法规附件
     * @return 政策法规附件集合
     */
    public List<BidPolicylawFiles> selectBidPolicylawFilesList(BidPolicylawFiles bidPolicylawFiles);

    /**
     * 新增政策法规附件
     *
     * @param bidPolicylawFiles 政策法规附件
     * @return 结果
     */
    public int insertBidPolicylawFiles(BidPolicylawFiles bidPolicylawFiles);

    /**
     * 修改政策法规附件
     *
     * @param bidPolicylawFiles 政策法规附件
     * @return 结果
     */
    public int updateBidPolicylawFiles(BidPolicylawFiles bidPolicylawFiles);

    /**
     * 删除政策法规附件
     *
     * @param id 政策法规附件ID
     * @return 结果
     */
    public int deleteBidPolicylawFilesById(Long id);

    /**
     * 批量删除政策法规附件
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBidPolicylawFilesByIds(Long[] ids);

    /**
     * 按PId删除
     * @param id
     * @return
     */
    int deleteBidPolicylawFilesByPId(Long id);
}
