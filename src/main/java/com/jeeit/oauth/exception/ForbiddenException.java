package com.jeeit.oauth.exception;

import org.springframework.http.HttpStatus;

/**
 * @author 傅枫
 * @date 2018/7/8
 */
public class ForbiddenException extends OauthAuth2Exception {

	public ForbiddenException(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "access_denied";
	}

	@Override
	public int getHttpErrorCode() {
		return HttpStatus.FORBIDDEN.value();
	}

}

