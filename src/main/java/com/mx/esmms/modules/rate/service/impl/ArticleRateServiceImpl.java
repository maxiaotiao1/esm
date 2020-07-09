package com.mx.esmms.modules.rate.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mx.esmms.entity.ArticleRate;
import com.mx.esmms.modules.rate.mapper.ArticleRateMapper;
import com.mx.esmms.modules.rate.service.ArticleRateService;
import org.springframework.stereotype.Service;

@Service("articleRateService")
public class ArticleRateServiceImpl extends ServiceImpl<ArticleRateMapper, ArticleRate> implements ArticleRateService {
}
