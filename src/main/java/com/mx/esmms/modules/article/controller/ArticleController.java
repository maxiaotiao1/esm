package com.mx.esmms.modules.article.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mx.esmms.common.r.R;
import com.mx.esmms.common.utils.JwtUtils;
import com.mx.esmms.entity.Article;
import com.mx.esmms.entity.UserArticle;
import com.mx.esmms.modules.article.service.ArticleService;
import com.mx.esmms.modules.article.service.UserArticleService;
import com.mx.esmms.modules.article.vo.QueryArticleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@CrossOrigin
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    UserArticleService userArticleService;
    @Autowired
    ArticleService articleService;

    @GetMapping("/getArticleList")
    public R getArticleList(HttpServletRequest request, QueryArticleVo queryArticleVo){
        Integer userId = JwtUtils.getMemberIdByJwtToken(request);
        //获取文章id
        List<UserArticle> articleIdList = userArticleService.list(new QueryWrapper<UserArticle>().select("article_id").eq("user_id",userId));
        List<Integer> list = new ArrayList<>();
        for (UserArticle i:
             articleIdList) {
            list.add(i.getArticleId());
        }
        Page<Article> pageParam = new Page<>(queryArticleVo.getPageNum(), queryArticleVo.getPageSize());
        QueryWrapper<Article> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("id","year","title","author","material","content","strategy","first_cycle_id","define_c")
                    .in("id",list);
        articleService.page(pageParam,queryWrapper);
        List<Article> records = pageParam.getRecords();
        long total = pageParam.getTotal();
        return R.ok().put("articleList",records).put("total",total);
    }
}
