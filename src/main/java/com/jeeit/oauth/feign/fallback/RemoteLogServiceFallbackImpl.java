

package com.jeeit.oauth.feign.fallback;

import com.jeeit.oauth.entity.SysLog;
import com.jeeit.oauth.feign.RemoteLogService;
import com.jeeit.oauth.util.R;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author 傅枫
 * @date 2018/6/26
 */
@Slf4j
@Component
public class RemoteLogServiceFallbackImpl implements RemoteLogService {
	@Setter
	private Throwable cause;

	/**
	 * 保存日志
	 *
	 * @param sysLog
	 * @return R
	 */
	@Override
	public R<Boolean> saveLog(SysLog sysLog) {
		log.error("feign 插入日志失败", cause);
		return null;
	}
}
