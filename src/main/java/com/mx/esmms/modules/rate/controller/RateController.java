package com.mx.esmms.modules.rate.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mx.esmms.common.r.R;
import com.mx.esmms.entity.ArticleRate;
import com.mx.esmms.entity.RatePerformance;
import com.mx.esmms.modules.rate.service.ArticleRateService;
import com.mx.esmms.modules.rate.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class RateController {

    @Autowired
    ArticleRateService articleRateService;
    @Autowired
    RateService rateService;

    @GetMapping("/rates")
    public R getCycleByRateId(Integer articleId) {

        List<ArticleRate> rateIdList = articleRateService.list(new QueryWrapper<ArticleRate>().select("rate_performance_id").eq("article_id",articleId));
        List<Integer> list = new ArrayList<>();
        for (ArticleRate i:
                rateIdList) {
            list.add(i.getRatePerformanceId());
        }
        list.add(-1);//防止条件为空，则无条件

        List<RatePerformance> records = rateService.list(new QueryWrapper<RatePerformance>().in("id",list));

        return R.ok().put("rates",records);
    }
}
