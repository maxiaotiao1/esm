package com.mx.esmms.modules.article.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mx.esmms.entity.UserArticle;
import com.mx.esmms.modules.article.mapper.UserArticleMapper;
import com.mx.esmms.modules.article.service.UserArticleService;
import org.springframework.stereotype.Service;

@Service("userArticleService")
public class UserArticleServiceImpl extends ServiceImpl<UserArticleMapper, UserArticle> implements UserArticleService {
}
