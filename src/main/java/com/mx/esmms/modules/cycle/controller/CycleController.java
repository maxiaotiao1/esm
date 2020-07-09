package com.mx.esmms.modules.cycle.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mx.esmms.common.r.R;
import com.mx.esmms.entity.Article;
import com.mx.esmms.entity.ArticleCycle;
import com.mx.esmms.entity.CyclePerformance;
import com.mx.esmms.modules.article.service.ArticleService;
import com.mx.esmms.modules.cycle.service.ArticleCycleService;
import com.mx.esmms.modules.cycle.service.CycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/cycle")
public class CycleController {

    @Autowired
    ArticleCycleService articleCycleService;
    @Autowired
    CycleService cycleService;

    @GetMapping("/getcycle/{articleId}")
    public R getCycleByArticleId(@PathVariable Integer articleId){

        List<ArticleCycle> articleIdList = articleCycleService.list(new QueryWrapper<ArticleCycle>().select("cycle_performance_id").eq("article_id",articleId));
        List<Integer> list = new ArrayList<>();
        for (ArticleCycle i:
                articleIdList) {
            list.add(i.getArticleId());
        }
        QueryWrapper<CyclePerformance> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("id",list);
        List<CyclePerformance> records = cycleService.list(queryWrapper);

        return R.ok().put("cycleList",records);
    }
}
