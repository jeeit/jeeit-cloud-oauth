

package com.jeeit.oauth.feign;

import com.baomidou.mybatisplus.plugins.Page;
import com.jeeit.oauth.common.ServiceNameConstant;
import com.jeeit.oauth.feign.factory.RemoteTokenServiceFallbackFactory;
import com.jeeit.oauth.util.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author 傅枫
 * @date 2018/9/4
 */
@FeignClient(value = ServiceNameConstant.AUTH_SERVICE, fallbackFactory = RemoteTokenServiceFallbackFactory.class)
public interface RemoteTokenService {
	/**
	 * 分页查询token 信息
	 *
	 * @param params 分页参数
	 * @param from   内部调用标志
	 * @return page
	 */
	@PostMapping("/oauth/listToken")
	Page selectPage(@RequestBody Map<String, Object> params, @RequestHeader("from") String from);

	/**
	 * 删除token
	 *
	 * @param token token
	 * @param from  调用标志
	 * @return
	 */
	@DeleteMapping("/oauth/delToken/{token}")
	R<Boolean> deleteTokenById(@PathVariable("token") String token, @RequestHeader("from") String from);
}
