package com.classpark.small.product.dao;

import com.classpark.small.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author classpark
 * @email tanzhq1995@gmail.com
 * @date 2020-10-10 09:45:58
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {

}
