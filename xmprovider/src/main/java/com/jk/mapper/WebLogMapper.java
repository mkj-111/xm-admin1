package com.jk.mapper;

import com.jk.entity.OrderGoods;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.math.BigDecimal;
@Mapper
public interface WebLogMapper {
    @Insert("insert into xm_order_goods values(#{id},#{userId},#{orderNum},#{orderSumPrice},#{orderStatus},#{receivingAddress},#{receivingTelephone},#{consignee},#{createTime},#{serialNumber},#{payType},#{paymentTime},#{ordergoodsName},#{goodsId},#{goodsNum})")
    void insertOrderGoods(OrderGoods orderGoods);
    @Update("update xm_goods set goods_num=goods_num-#{orderNum} where id=#{goodsId}")
    void delNum(String goodsId, String orderNum);
    @Update("update xm_user  set money=money-#{orderSumPrice} where user_id=#{userId}")
    void delMoney(Integer userId, BigDecimal orderSumPrice);
}
