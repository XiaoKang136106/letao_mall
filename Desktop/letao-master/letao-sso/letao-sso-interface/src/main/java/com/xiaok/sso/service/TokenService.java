package com.xiaok.sso.service;

import com.xiaok.common.pojo.TaotaoResult;

/**
 * <pre>
 * Description: 根据token查询用户信息
 * Author:		xiaok
 * Version:		1.0
 * </pre>
 */
public interface TokenService {
    TaotaoResult getUserByToken(String token);
}
