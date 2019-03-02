package com.jeeit.oauth.exception;

import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;

/**
 * @author 傅枫
 * @date 2018/7/8
 * 自定义OAuth2Exception
 */
public class OauthAuth2Exception extends OAuth2Exception {

	public OauthAuth2Exception(String msg) {
		super(msg);
	}
}
