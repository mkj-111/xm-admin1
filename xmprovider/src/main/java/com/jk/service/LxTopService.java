package com.jk.service;


import com.jk.entity.Goods;
import com.jk.entity.GoodsBeab;
import com.jk.entity.HuiFuBean;
import com.jk.entity.PingLunBean;

import java.util.List;

/**
 * @author: 李新
 * @Date: 2020/11/4 20:26
 * @Description: 励志：一giao窝里giao giao
 */
public interface LxTopService {
    List<GoodsBeab> queryTopList(String topName, Integer type);

    List<PingLunBean> findPingLunId(Integer ids);

    void addPingLun(PingLunBean pingLunBean);

    void updateDianZan(Integer dian,String id);

    void insertHuiFu(HuiFuBean huiFuBean);

    List<HuiFuBean> queryHuiFu(String pid);
}
