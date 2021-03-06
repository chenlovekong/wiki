package com.kong.wiki.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UnifyResponse<T> {

    /**
     * 业务上的成功或失败
     */
    private boolean success = true;

    /**
     * 返回信息
     */
    private String message = "数据返回成功";

    /**
     * 返回泛型数据，自定义类型
     */
    private T content;
}
