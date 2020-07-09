package com.mx.esmms.modules.firstcycle.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mx.esmms.entity.FirstCycle;
import com.mx.esmms.modules.firstcycle.mapper.FirstCycleMapper;
import com.mx.esmms.modules.firstcycle.service.FirstCycleService;
import org.springframework.stereotype.Service;

@Service("firstCycleService")
public class FirstCycleServiceImpl extends ServiceImpl<FirstCycleMapper, FirstCycle> implements FirstCycleService {
}
