

package com.jeeit.oauth.vo;


import com.jeeit.oauth.entity.SysLog;
import lombok.Data;

import java.io.Serializable;

/**
 * @author 傅枫
 * @date 2017/11/20
 */
@Data
public class LogVO implements Serializable {
	private static final long serialVersionUID = 1L;

	private SysLog sysLog;
	private String username;
}
