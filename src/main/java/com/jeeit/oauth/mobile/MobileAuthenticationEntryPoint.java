package com.jeeit.oauth.mobile;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.oauth2.provider.error.AbstractOAuth2SecurityExceptionHandler;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.util.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 傅枫
 * @date 2018/8/16
 * 手机号登录异常处理
 */
public class MobileAuthenticationEntryPoint extends AbstractOAuth2SecurityExceptionHandler implements
	AuthenticationEntryPoint {
	private static final String WWW_AUTHENTICATE = "WWW-Authenticate";
	private static final String SUFFIX = ",";

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException)
		throws IOException, ServletException {
		doHandle(request, response, authException);
	}

//	@Override
//	protected ResponseEntity<OAuth2Exception> enhanceResponse(ResponseEntity<OAuth2Exception> response, Exception exception) {
//		HttpHeaders headers = response.getHeaders();
//		String existing = null;
//		if (headers.containsKey(WWW_AUTHENTICATE)) {
//			existing = extractTypePrefix(headers.getFirst("WWW-Authenticate"));
//		}
//		StringBuilder builder = new StringBuilder();
//		String typeName = OAuth2AccessToken.BEARER_TYPE;
//		builder.append(typeName + " ");
//		String realmName = "oauth";
//		builder.append("realm=\"" + realmName + "\"");
//		if (existing != null) {
//			builder.append(", " + existing);
//		}
//		HttpHeaders update = new HttpHeaders();
//		update.putAll(response.getHeaders());
//		update.set("WWW-Authenticate", builder.toString());
//		return new ResponseEntity<>(response.getBody(), update, HttpStatus.EXPECTATION_FAILED);
//	}

	private String extractTypePrefix(String header) {
		String existing = header;
		String[] tokens = existing.split(" +");
		if (tokens.length > 1 && !tokens[0].endsWith(SUFFIX)) {
			existing = StringUtils.arrayToDelimitedString(tokens, " ").substring(existing.indexOf(" ") + 1);
		}
		return existing;
	}

}

