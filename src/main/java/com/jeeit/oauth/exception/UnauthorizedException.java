package com.jeeit.oauth.exception;

import org.springframework.http.HttpStatus;

/**
 * @author 傅枫
 * @date 2018/7/8
 */
public class UnauthorizedException extends OauthAuth2Exception {

	public UnauthorizedException(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "unauthorized";
	}

	@Override
	public int getHttpErrorCode() {
		return HttpStatus.UNAUTHORIZED.value();
	}

}
