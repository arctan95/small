package com.classpark.small.order.dao;

import com.classpark.small.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 *
 * @author classpark
 * @email tanzhq1995@gmail.com
 * @date 2020-10-10 22:52:41
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {

}
