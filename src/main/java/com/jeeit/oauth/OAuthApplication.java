package com.jeeit.oauth;



import com.jeeit.oauth.feign.EnableOauthFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author 傅枫
 * @date 2018年06月21日
 * 认证授权中心
 */
@SpringCloudApplication
@EnableOauthFeignClients
public class OAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuthApplication.class, args);
	}

}
