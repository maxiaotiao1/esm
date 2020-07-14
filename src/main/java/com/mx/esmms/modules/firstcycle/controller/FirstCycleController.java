package com.mx.esmms.modules.firstcycle.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mx.esmms.common.r.R;
import com.mx.esmms.entity.FirstCycle;
import com.mx.esmms.modules.firstcycle.service.FirstCycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class FirstCycleController {

    @Autowired
    FirstCycleService firstCycleService;

    @GetMapping("/firstcycles/{firstCycleId}")
    public R getFirstCycle(@PathVariable Integer firstCycleId){
        QueryWrapper<FirstCycle> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", firstCycleId);
        FirstCycle firstCycle = firstCycleService.getOne(queryWrapper);
        return R.ok().put("firstCycle",firstCycle);
    }
}
