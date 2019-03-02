package com.jeeit.oauth.exception;

import org.springframework.http.HttpStatus;

/**
 * @author 傅枫
 * @date 2018/7/8
 */
public class MethodNotAllowed extends OauthAuth2Exception {

	public MethodNotAllowed(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "method_not_allowed";
	}

	@Override
	public int getHttpErrorCode() {
		return HttpStatus.METHOD_NOT_ALLOWED.value();
	}

}
