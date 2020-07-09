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
@RequestMapping("/rate")
public class RateController {

    @Autowired
    ArticleRateService articleRateService;
    @Autowired
    RateService rateService;

    @GetMapping("/getrate/{articleId}")
    public R getCycleByRateId(@PathVariable Integer articleId) {

        List<ArticleRate> articleIdList = articleRateService.list(new QueryWrapper<ArticleRate>().select("rate_performance_id").eq("article_id",articleId));
        List<Integer> list = new ArrayList<>();
        for (ArticleRate i:
                articleIdList) {
            list.add(i.getArticleId());
        }
        QueryWrapper<RatePerformance> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("id",list);
        List<RatePerformance> records = rateService.list(queryWrapper);

        return R.ok().put("cycleList",records);
    }
}
