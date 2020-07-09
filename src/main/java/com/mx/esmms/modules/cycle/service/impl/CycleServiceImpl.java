package com.mx.esmms.modules.cycle.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mx.esmms.entity.CyclePerformance;
import com.mx.esmms.modules.cycle.mapper.CycleMapper;
import com.mx.esmms.modules.cycle.service.CycleService;
import org.springframework.stereotype.Service;

@Service("cycleService")
public class CycleServiceImpl extends ServiceImpl<CycleMapper, CyclePerformance> implements CycleService {
}
