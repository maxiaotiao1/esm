package com.mx.esmms.modules.cycle.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mx.esmms.common.r.R;
import com.mx.esmms.entity.ArticleCycle;
import com.mx.esmms.entity.CyclePerformance;
import com.mx.esmms.modules.cycle.service.ArticleCycleService;
import com.mx.esmms.modules.cycle.service.CycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class CycleController {

    @Autowired
    ArticleCycleService articleCycleService;
    @Autowired
    CycleService cycleService;

    @GetMapping("/cycles")
    public R getCycleByArticleId( Integer articleId){

        List<ArticleCycle> articleIdList = articleCycleService.list(new QueryWrapper<ArticleCycle>().select("cycle_performance_id").eq("article_id",articleId));
        List<Integer> list = new ArrayList<>();
        for (ArticleCycle i:
                articleIdList) {
            list.add(i.getCyclePerformanceId());
        }
        list.add(-1);//防止条件为空，则无条件

        QueryWrapper<CyclePerformance> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("id",list);
        List<CyclePerformance> records = cycleService.list(queryWrapper);

        return R.ok().put("cycles",records);
    }
}
