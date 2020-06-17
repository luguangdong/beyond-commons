package com.beyond.commons.exceptions;

import com.beyond.commons.response.ResponseCode;

/**
 * <p>
 * Description: 全局业务异常
 * </p>
 *
 * @author luguangdong
 * @version 1.0.0
 * @ClassName BusinessException
 * @date 2020/6/17 21:34
 * @company https://www.beyond.com/
 */
public class BusinessException extends RuntimeException{
    private static final long serialVersionUID = 4868842805385777275L;

    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public BusinessException() {}

    public BusinessException(String message) {
        super(message);
        this.code = -1;
    }

    public BusinessException(ResponseCode status) {
        super(status.message());
        this.code = status.code();
    }
}
