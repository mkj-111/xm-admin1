package com.jk.service;
import com.jk.entity.xmtree;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
@FeignClient("xmprovider")
public interface TreeService {
    @RequestMapping("findtree")
    public List<xmtree> findtree();
}
