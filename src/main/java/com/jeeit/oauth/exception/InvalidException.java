package com.jeeit.oauth.exception;

/**
 * @author 傅枫
 * @date 2018/7/8
 */
public class InvalidException extends OauthAuth2Exception {

	public InvalidException(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "invalid_exception";
	}

	@Override
	public int getHttpErrorCode() {
		return 426;
	}

}
