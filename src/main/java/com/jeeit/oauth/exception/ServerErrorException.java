package com.jeeit.oauth.exception;

import org.springframework.http.HttpStatus;

/**
 * @author 傅枫
 * @date 2018/7/8
 */
public class ServerErrorException extends OauthAuth2Exception {

	public ServerErrorException(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "server_error";
	}

	@Override
	public int getHttpErrorCode() {
		return HttpStatus.INTERNAL_SERVER_ERROR.value();
	}

}
