

package com.jeeit.oauth.feign.factory;

import com.jeeit.oauth.feign.fallback.RemoteUserServiceFallbackImpl;
import com.jeeit.oauth.feign.RemoteUserService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author 傅枫
 * @date 2018/9/1
 */
@Component
public class RemoteUserServiceFallbackFactory implements FallbackFactory<RemoteUserService> {

	@Override
	public RemoteUserService create(Throwable throwable) {
		RemoteUserServiceFallbackImpl remoteUserServiceFallback = new RemoteUserServiceFallbackImpl();
		remoteUserServiceFallback.setCause(throwable);
		return remoteUserServiceFallback;
	}
}
