

package com.jeeit.oauth.feign;

import com.jeeit.oauth.common.ServiceNameConstant;
import com.jeeit.oauth.entity.SysLog;
import com.jeeit.oauth.feign.factory.RemoteLogServiceFallbackFactory;
import com.jeeit.oauth.util.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author 傅枫
 * @date 2018/6/28
 */
@FeignClient(value = ServiceNameConstant.UMPS_SERVICE, fallbackFactory = RemoteLogServiceFallbackFactory.class)
public interface RemoteLogService {
	/**
	 * 保存日志
	 *
	 * @param sysLog 日志实体
	 * @return succes、false
	 */
	@PostMapping("/log")
	R<Boolean> saveLog(@RequestBody SysLog sysLog);
}
