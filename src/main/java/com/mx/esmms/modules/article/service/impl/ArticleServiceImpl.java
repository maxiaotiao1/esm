package com.mx.esmms.modules.article.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mx.esmms.entity.Article;
import com.mx.esmms.modules.article.mapper.ArticleMapper;
import com.mx.esmms.modules.article.service.ArticleService;
import org.springframework.stereotype.Service;

@Service("articleService")
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper,Article> implements ArticleService {
}
