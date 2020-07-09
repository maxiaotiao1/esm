package com.mx.esmms.modules.rate.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mx.esmms.entity.RatePerformance;
import com.mx.esmms.modules.rate.mapper.RateMapper;
import com.mx.esmms.modules.rate.service.RateService;
import org.springframework.stereotype.Service;

@Service("rateService")
public class RateServiceImpl extends ServiceImpl<RateMapper, RatePerformance> implements RateService {
}
