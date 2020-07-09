package com.mx.esmms.modules.cycle.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mx.esmms.entity.ArticleCycle;
import com.mx.esmms.modules.cycle.mapper.ArticleCycleMapper;
import com.mx.esmms.modules.cycle.service.ArticleCycleService;
import org.springframework.stereotype.Service;

@Service("articleCycleService")
public class ArticleCycleServiceImpl extends ServiceImpl<ArticleCycleMapper, ArticleCycle> implements ArticleCycleService {
}
