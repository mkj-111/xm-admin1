package com.jk.service.Impl;

import com.jk.entity.xmtree;
import com.jk.mapper.xmtreeMapper;
import com.jk.service.TreeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TreeServiceImpl implements TreeService {
    @Resource
    private xmtreeMapper xmtreeMapper;


    //树
    @Override
    public List<xmtree> findtree() {
        int pid = 0;
        List<xmtree> list = findnode(pid);
        return list;
    }

    private List<xmtree> findnode(int pid) {
        List<xmtree> list = xmtreeMapper.findtree(pid);
       /* for (xmtree tree:list
        ) {
            Integer id = tree.getId();
            List<xmtree> list1 = findnode(id);
            if(list1==null || list1.isEmpty()){
                tree.setSelectable(true);
            }else{
                tree.setSelectdsvsdvdsf
            ectable(false);
                tree.setNodes(list1);
            }
        }*/
        return list;
    }
}
