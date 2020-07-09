package com.mx.esmms.modules.redis;

import java.util.concurrent.TimeUnit;

public interface ReidsKeyTimeOut {
    Long MOBILE_CODE = 5L;
    TimeUnit MOBILE_CODE_TIMEUNIT = TimeUnit.MINUTES;
    public final static Long WXUSER_TIMEOUT = 2L;
    public final static TimeUnit WXUSER_TIMEUNIT = TimeUnit.HOURS;

}
