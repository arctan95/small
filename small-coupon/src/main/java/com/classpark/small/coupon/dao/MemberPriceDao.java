package com.classpark.small.coupon.dao;

import com.classpark.small.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 *
 * @author classpark
 * @email tanzhq1995@gmail.com
 * @date 2020-10-10 22:20:49
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {

}
